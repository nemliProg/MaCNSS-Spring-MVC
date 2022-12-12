package ma.macnss.dao;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ma.macnss.dao.system.ProcessFolder;
import ma.macnss.entities.*;
import ma.macnss.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Component
@NoArgsConstructor
@AllArgsConstructor
@Transactional
public class AgentDao {

    @Autowired
    private AgentRepository agentRepository;
    @Autowired
    private DossierRepository dossierRepository;
    @Autowired
    private MedicationRepository medicationRepository;
    @Autowired
    private PrescriptionRepository prescriptionRepository;
    @Autowired
    private ScannerRepository scannerRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ProcessFolder processFolder;

    public boolean login(String email, String password, HttpServletRequest request){
        Optional<Agent> agent = agentRepository.findByEmail(email);
        if(agent.isPresent()){
            if(agent.get().getPassword().equals(password)){
                request.getSession().setAttribute("id",agent.get().getId());
                request.getSession().setAttribute("agent",agent.get());
                System.out.println("Agent logged in");
                return true;
            }
        }
        return false;
    }

    public boolean createFolder(String matriculeClient,List<String> medications,List<String> prescriptions,List<String> scanners){
        // dossier
        Dossier dossier = new Dossier();
        dossier.setCode(UUID.randomUUID().toString());
        dossier.setMatriculeClient(clientRepository.findById(matriculeClient).get());
        dossier.setStatus("PENDING");
        dossier.setResponse("PENDING");
        // create dossier
        dossierRepository.save(dossier);
        // create medications
        for(String medication : medications){
            Medicament medicament = new Medicament();
            medicament.setCode(medication);
            medicament.setCodeDossier(dossierRepository.findById(dossier.getCode()).get());
            medicationRepository.save(medicament);
        }
        // create prescriptions
        for(String prescription : prescriptions){
            Ordonnance ordonnance = new Ordonnance();
            ordonnance.setTypeMedecin(prescription);
            ordonnance.setCodeDossier(dossierRepository.findById(dossier.getCode()).get());
            prescriptionRepository.save(ordonnance);
        }
        // create scanners
        for(String scannerCode : scanners){
            Scanner scanner = new Scanner();
            scanner.setCode(scannerCode);
            scanner.setCodeDossier(dossierRepository.findById(dossier.getCode()).get());
            scannerRepository.save(scanner);
        }

        if (dossierRepository.findById(dossier.getCode()).isPresent()) {
            // process folder
            Double total = processFolder.processFolder(dossier.getCode());
            dossier.setTotalPrix(total.toString());
            dossier.setResponse("TREATED");
            dossierRepository.save(dossier);
            return true;
        }
        return false;
    }



}

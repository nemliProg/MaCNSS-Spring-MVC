package ma.macnss.dao.system;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.macnss.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@NoArgsConstructor
@Data
@AllArgsConstructor
@Transactional
public class ProcessFolder {

    @Autowired
    private DossierRepository dossierRepository;
    @Autowired
    private MedicationRepository medicationRepository;
    @Autowired
    private MedicationCnssRepository medicationCnssRepository;
    @Autowired
    private PrescriptionRepository prescriptionRepository;
    @Autowired
    private PrescriptionCnssRepository prescriptionCnssRepository;
    @Autowired
    private ScannerRepository scannerRepository;
    @Autowired
    private ScannerCnssRepository scannerCnssRepository;

    public Double processFolder(String code){
        Double total = 0.0;
        total += medicationRepository.findMedicamentsCodeByCodeDossier(code).stream().map(m -> medicationCnssRepository.findById(m).get().getPrixRembourcement()).mapToDouble(Double::doubleValue).sum();
        total += prescriptionRepository.findOrdonnanceTypeMedecinByCodeDossier(code).stream().map(p -> prescriptionCnssRepository.findById(p).get().getPrixRembourcement()).mapToDouble(Double::doubleValue).sum();
        total += scannerRepository.findScannerCodeByCodeDossier(code).stream().map(s -> scannerCnssRepository.findById(s).get().getPrixRembourcement()).mapToDouble(Double::doubleValue).sum();
        return total;
    }


}

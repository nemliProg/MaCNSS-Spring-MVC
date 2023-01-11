package ma.macnss.controllers.agent;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import ma.macnss.dao.AgentDao;
import ma.macnss.dao.ClientDao;
import ma.macnss.dao.system.ProcessFolder;
import ma.macnss.repositories.ClientRepository;
import ma.macnss.repositories.DossierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/agent")
public class DashboardAgentController {

    @Autowired
    private AgentDao agentDao;
    @Autowired
    private DossierRepository dossierRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ProcessFolder processFolder;

    @RequestMapping("/dashboard")
    public String dashboard(HttpSession session, ModelMap model){
        // check if the user is logged in
        if (session.getAttribute("agent") == null && session.getAttribute("id") == null) {
            return "redirect:/agent-login";
        }
        model.addAttribute("clients", clientRepository.findAll());
        model.addAttribute("folders", dossierRepository.findAll());
        return "agent/dashboard";
    }

    @PostMapping("/create-folder")
    public String createFolder(HttpSession session, @RequestParam Map<String,String> allRequests, ModelMap model){
        // check if the user is logged in
        if (session.getAttribute("agent") == null && session.getAttribute("id") == null) {
            return "redirect:/agent-login";
        }
        model.addAttribute("clients", clientRepository.findAll());
        model.addAttribute("folders", dossierRepository.findAll());

        String matriculeClient = allRequests.get("cin");
        ArrayList<String> medicaments = new ArrayList<>();
        ArrayList<String> ordonnances = new ArrayList<>();
        ArrayList<String> scanners = new ArrayList<>();
        // get the data from the form
        for (int i = 1; i <= Integer.parseInt(allRequests.get("medicationQ")) ; i++) {
            medicaments.add(allRequests.get("medi"+i));
        }
        for (int i = 1; i <= Integer.parseInt(allRequests.get("prescriptionQ")) ; i++) {
            ordonnances.add(allRequests.get("pres"+i));
        }
        for (int i = 1; i <= Integer.parseInt(allRequests.get("scannerQ")) ; i++) {
            scanners.add(allRequests.get("scnr"+i));
        }
        // create the folder
        boolean IsCreated = agentDao.createFolder(matriculeClient,medicaments,ordonnances,scanners);
        // check if the folder is created
        if(IsCreated){
            model.addAttribute("success","The folder has been created successfully");
        }else{
            model.addAttribute("error","An error occurred while creating the folder");
        }

        // redirect to the dashboard
        return "redirect:agent/dashboard";
    }

    @PostMapping("/accept-folder")
    public String acceptFolder(HttpSession session, @RequestParam Map<String,String> allRequests, ModelMap model){
        // check if the user is logged in
        if (session.getAttribute("agent") == null && session.getAttribute("id") == null) {
            return "redirect:/agent-login";
        }
        model.addAttribute("clients", clientRepository.findAll());
        model.addAttribute("folders", dossierRepository.findAll());

        String idFolder = allRequests.get("code-folder");
        // accept the folder
        boolean IsAccepted = agentDao.acceptFolder(idFolder);
        // check if the folder is accepted
        if(IsAccepted){
            model.addAttribute("success","The folder has been accepted successfully");
        }else{
            model.addAttribute("error","An error occurred while accepting the folder");
        }

        // redirect to the dashboard
        return "redirect:agent/dashboard";
    }


}

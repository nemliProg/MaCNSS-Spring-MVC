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




}

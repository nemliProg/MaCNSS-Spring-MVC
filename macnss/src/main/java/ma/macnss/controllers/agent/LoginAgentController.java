package ma.macnss.controllers.agent;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ma.macnss.dao.AgentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;

@Controller

public class LoginAgentController {

    @Autowired
    private AgentDao agentDao;

    @GetMapping("/agent-login")
    public String login(){
        return "agent/login";
    }

    @PostMapping("/agent-login")
    public String loginPost(@RequestParam Map<String,String> allRequests, HttpServletRequest request, HttpServletResponse response, ModelMap model) throws IOException {
        boolean isLogged = agentDao.login(allRequests.get("email"),allRequests.get("password"),request);
        if(isLogged) {
            model.addAttribute("message", "Login success");
            response.sendRedirect("/agent/dashboard");
        }
        return "agent/login";
    }

}

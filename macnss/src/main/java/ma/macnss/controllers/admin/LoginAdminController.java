package ma.macnss.controllers.admin;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ma.macnss.dao.AdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;

@Controller

public class LoginAdminController {

    @Autowired
    private AdminDao adminDao;

    @GetMapping("/admin-login")
    public String login(){
        return "admin/login";
    }

    @PostMapping("/admin-login")
    public String loginPost(@RequestParam Map<String,String> allRequests, HttpServletRequest request, HttpServletResponse response, ModelMap model) throws IOException {
        boolean isLogged = adminDao.login(allRequests.get("email"),allRequests.get("password"),request);
        if(isLogged) {
            model.addAttribute("message", "Login success");
            response.sendRedirect("/admin/dashboard");
        }
        return "admin/login";
    }

}

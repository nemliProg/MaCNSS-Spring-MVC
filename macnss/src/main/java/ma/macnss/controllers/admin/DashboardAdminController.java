package ma.macnss.controllers.admin;


import jakarta.servlet.http.HttpSession;
import ma.macnss.dao.AdminDao;
import ma.macnss.entities.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class DashboardAdminController {

    @Autowired
    AdminDao adminDao;

    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String dashboard(HttpSession session) {
        // check if the user is logged in
        if (session.getAttribute("admin") == null) {
            return "redirect:/admin-login";
        }
        return "admin/dashboard";
    }



}

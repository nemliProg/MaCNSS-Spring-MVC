package ma.macnss.controllers;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.macnss.dao.AdminDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller @AllArgsConstructor
public class HomeController {


    private EntityManager entityManager;

    @RequestMapping("/home")
    @Transactional
    public String home(){
        return "index";
    }
}
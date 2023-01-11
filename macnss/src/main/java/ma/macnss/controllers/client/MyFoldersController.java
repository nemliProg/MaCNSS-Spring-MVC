package ma.macnss.controllers.client;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/client/myfolders")
public class MyFoldersController {

    @RequestMapping(method = RequestMethod.GET)
    public String dashboard(){
        return "client/myfolders";
    }

}

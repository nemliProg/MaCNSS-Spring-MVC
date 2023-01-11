package ma.macnss.controllers.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/client-login")
public class LoginClientController {

    @RequestMapping(method = RequestMethod.GET)
    public String login(){
        return "client/login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String loginPost(){
        return "client/login";
    }

}

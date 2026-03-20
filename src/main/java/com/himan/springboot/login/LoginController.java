package com.himan.springboot.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
    //@Autowired
    //private AuthenticationService authenticationService;
    @RequestMapping(value="/",method= RequestMethod.GET)
    public String login(ModelMap modelMap){
        modelMap.put("name","Himan");
        return "welcome";
    }

   /* @RequestMapping(value="login",method= RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap modelMap){
        if(authenticationService.authenticate(name,password)){
            modelMap.put("name",name);
            return "welcome";
        }
        return "login";
    }*/
}

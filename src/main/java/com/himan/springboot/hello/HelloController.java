package com.himan.springboot.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello how are you doing today?";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml(){
        return "<html><head><title>My first html page</title></head><body>My first html page with body</body></html>";
    }

    @RequestMapping("/say-hello-jsp")
    public String sayHelloJsp(@RequestParam String name, ModelMap model){
        model.put("name",name);
        logger.info("Request param is:: {}",name);
        return "sayHello";
    }
}

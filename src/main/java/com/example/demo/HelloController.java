package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;
import java.util.Properties;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        StringBuffer sb = new StringBuffer();
        sb.append("Greetings from Spring Boot!\n\n");
        Map<String, String> enviorntmentVars  = System.getenv();
        enviorntmentVars.entrySet().forEach(sb::append);
        
        return sb.toString();
    }

}

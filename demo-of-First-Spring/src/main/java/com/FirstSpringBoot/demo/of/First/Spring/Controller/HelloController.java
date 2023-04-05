package com.FirstSpringBoot.demo.of.First.Spring.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${welcome.message}")
    private String welcomeMessage;

    //@RequestMapping(value="/" )
    @GetMapping("/")
    public String helloworld(){

        return welcomeMessage;
    }
}

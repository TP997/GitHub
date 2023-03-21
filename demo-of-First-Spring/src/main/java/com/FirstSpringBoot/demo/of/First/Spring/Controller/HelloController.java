package com.FirstSpringBoot.demo.of.First.Spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value="/" )
    public String helloworld(){
    return "welcome to First Spring Boot Project";
    }
}

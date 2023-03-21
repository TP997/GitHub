package com.thanuja.helloProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/Hello")
    public String getHello(){
        return "HelloWorld";
    }
}

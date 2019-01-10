package com.wangchi.example.mavenwardemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBootWar {
    @RequestMapping("/hello")
    public String sayHello(){
        return "hello spring Boot war projetc";
    }

}

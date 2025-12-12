package com.ag.gitPracticing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
    	return "Hello from merged version!";

    }
    
    @GetMapping("/bye")
    public String bye() {
        return "Bye, new project!";
    }
}

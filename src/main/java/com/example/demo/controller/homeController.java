package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// http://localhost:8082/api/v1


@Controller
@RequestMapping(value = "/home")
public class homeController {

    @GetMapping(value = "/inicio")
    public String home(){
        return "home"; 

    }


    
}

package com.cluster.cicd.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/isSucessFull")
    public String Congratulations() {
        return "Sucessfully deployed the ci&cd pipeline .. ️❤️";
    }
    @GetMapping("/cicd")
    public String Congratulations2() {
        return "My dream comes to love you so much god ...!💙";
    }
}

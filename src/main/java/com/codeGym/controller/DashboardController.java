package com.codeGym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class DashboardController {

    @GetMapping("/dashboard")
    public String login(){
        return "dashboard";
    }
}

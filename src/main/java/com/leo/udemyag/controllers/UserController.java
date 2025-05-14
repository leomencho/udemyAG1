package com.leo.udemyag.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user")
    public String detail(Model model){
        model.addAttribute("name", "Leo");
        model.addAttribute("lastName", "Bollini");
        return "detail";
    }
}

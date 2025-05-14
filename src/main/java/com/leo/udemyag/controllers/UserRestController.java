package com.leo.udemyag.controllers;

import com.leo.udemyag.Models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("api")
public class UserRestController {

    @GetMapping("/user")
    public Map<String, Object> detail(){
        User user = new User("Leo", "Bollini");
        Map<String, Object> body = new HashMap<>();
        body.put("Yo", user);
        return body;
    }

}

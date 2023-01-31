package com.example.TP3.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddresseController {
    @GetMapping("/addresse")
    public String showAddresses() {;
        return "addresse";
    }
}

package com.example.TP3.demo.controller;

import com.example.TP3.demo.model.AdresseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddressController {

    @Autowired
    AdresseRepository addressRepository;

    @GetMapping("/adresses")
    public String showAddresses(Model model) {
        model.addAttribute("allAddresses", addressRepository.findAll());
        return "addresses";
    }

}

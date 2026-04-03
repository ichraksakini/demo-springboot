package com.example.demo;

import com.example.demo.model.Energie;
import com.example.demo.repository.EnergieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private EnergieRepository repo;

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("data", repo.findAll());

        return "dashboard";
    }
}
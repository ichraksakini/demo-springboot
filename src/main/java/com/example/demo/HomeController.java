package com.example.demo;

import com.example.demo.model.Energie;
import com.example.demo.repository.EnergieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final EnergieRepository energieRepository;

    public HomeController(EnergieRepository energieRepository) {
        this.energieRepository = energieRepository;
    }

   @GetMapping("/")
public String home(Model model) {
    var list = energieRepository.findAll();

    System.out.println("SIZE = " + list.size()); // 🔥 IMPORTANT

    model.addAttribute("energies", list);
    return "dashboard";
    }
}

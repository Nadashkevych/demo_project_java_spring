package com.example.demo.controller;

import com.example.demo.model.Guitar;
import com.example.demo.repository.GuitarRepos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {
    private GuitarRepos repos;

    public MainController(final GuitarRepos repos) {
        this.repos = repos;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<Guitar> guitars = repos.findAll();
        model.addAttribute("guitars", guitars);
        return "home";
    }

    @GetMapping("/guitar")
    public String guitar(Model model, @RequestParam("modName") String modName) {
        Guitar guitar = repos.findByName(modName);
        model.addAttribute("guitar", guitar);
        return "guitar";
    }

    @GetMapping("/gallery")
    public String gallery(Model model) {
        List<Guitar> guitars = repos.findAll();
        model.addAttribute("guitars", guitars);
        return "gallery";
    }

    @GetMapping("/producers")
    public String producers(Model model) {

        return "producers";
    }

    @GetMapping("/stars")
    public String stars(Model model) {

        return "stars";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("guitar", new Guitar());
        model.addAttribute("mode", "add");
        return "add";
    }

    @PostMapping("/add")
    public String addAGuitar(Guitar guitar) {
        repos.add(guitar);
        return "redirect:/guitar?modName=" + guitar.getModelName();
    }
}

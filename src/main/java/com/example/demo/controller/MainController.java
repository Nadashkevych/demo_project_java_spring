package com.example.demo.controller;

import com.example.demo.model.Guitar;
import com.example.demo.repository.GuitarRepos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MainController {
    private GuitarRepos repos;
    private String textFromFile;

    public MainController(final GuitarRepos repos) {
        this.repos = repos;
        File file = new File("file.txt");
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {
                this.textFromFile += line + "\n";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
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
        List<Guitar> guitars = repos.findAll();
        model.addAttribute("guitars", guitars);
        List<String> producers = guitars.stream()
                .map(Guitar::getProducer)
                .distinct()
                .collect(Collectors.toList());
        model.addAttribute("producers", producers);
        return "producers";
    }

    @GetMapping("/producer")
    public String producer(Model model, @RequestParam("producerNm") String producerNm) {
        model.addAttribute("producer", producerNm);
        List<Guitar> guitars = repos.findAll().stream()
                .filter(guitar -> guitar.getProducer().equals(producerNm))
                .collect(Collectors.toList());
        model.addAttribute("guitars", guitars);
        return "producer";
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
        try {
            File file = new File("file.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bfw = new BufferedWriter(fileWriter);
            String newText = (guitar.getModelName() + "regex" + guitar.getProducer() + "regex" + guitar.getGuitarist() + "regex" +
                    guitar.getDescription() + "regex" + guitar.getPictUrl());
            textFromFile += newText;
            bfw.write(textFromFile);
            bfw.newLine();
            bfw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:/guitar?modName=" + guitar.getModelName();
    }
}

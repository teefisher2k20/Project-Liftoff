package org.launchcode.projectliftoff.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloSpring {

    private static List<String> landingPage = new ArrayList<>();

    @GetMapping
    public String landingPage(Model model) {
        model.addAttribute("landingPage", landingPage);

        return "index";
    }
//localhost:8080/create
    @GetMapping("create")
    public String displayNewVoterForm(Model model) {

        return "voters/register";
    }

    @PostMapping("create")
    public String registerNewVoter(@RequestParam String firstName) {
        landingPage.add(firstName);
        return "redirect:/confirm";
    }



}

package org.launchcode.projectliftoff.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomePageController {

    private static List<String> landingPage = new ArrayList<>();

    //localhost:8080
    @GetMapping
    public String showLandingPage(Model model) {
        model.addAttribute("landingPage", landingPage);


        return "index";
    }
//localhost:8080/create
    @GetMapping("create")
    public String createNewVoterForm(Model model) {

        return "voters/register";
    }
//posts the voter confirmation page
    @PostMapping("create")
    public String confirmNewVoter(Model model) {

        return "voters/confirm";
    }

    }


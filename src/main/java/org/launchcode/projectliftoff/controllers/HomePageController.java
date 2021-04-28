package org.launchcode.projectliftoff.controllers;

import org.launchcode.projectliftoff.data.HomePageRepository;
import org.launchcode.projectliftoff.models.HomePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomePageController {

    @Autowired
    private HomePageRepository homePageRepository;

    //localhost:8080
    @GetMapping
    public String showLandingPage(Model model) {
        model.addAttribute("userName", "userName");
        model.addAttribute("firstName", homePageRepository.findAll());



        return "index";
    }
//localhost:8080/create
    @GetMapping("create")
    public String createNewVoterForm(Model model) {

        return "voters/register";
    }
//posts the voter confirmation page
    @PostMapping("create")
    public String confirmNewVoter(@ModelAttribute HomePage newHomePage) {
        homePageRepository.save(newHomePage);

        return "voters/confirm";
    }

    }


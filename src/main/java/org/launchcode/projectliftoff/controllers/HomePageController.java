package org.launchcode.projectliftoff.controllers;

import org.launchcode.projectliftoff.data.HomePageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomePageController {

    @Autowired
    private HomePageRepository homePageRepository;

    //localhost:8080
    @GetMapping
    public String showLandingPage(Model model) {



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


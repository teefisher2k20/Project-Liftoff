package org.launchcode.projectliftoff.controllers;

import org.launchcode.projectliftoff.data.HomePageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

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
        model.addAttribute("userName", "userName");
        model.addAttribute("firstName", homePageRepository.findAll());
        return "voters/register";
    }

    //posts the voter confirmation page
    @PostMapping("create")
    public String confirmNewVoter(Model model) {
        String userName = "";
        String firstName = "";
        String lastName = "";
        int phone = 0;
        String email = "";
        ArrayList<String> userInfo = new ArrayList<>();

        userInfo.add("userName");
        userInfo.add("firstName");
        userInfo.add("lastName");
        userInfo.add("phone");
        userInfo.add("email");
        model.addAttribute("userInfo", userInfo);
        model.addAttribute("userName", userName);
        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        model.addAttribute("phone", phone);
        model.addAttribute("email", email);
        return "voters/confirm";
    }

}


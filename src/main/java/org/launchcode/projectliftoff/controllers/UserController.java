package org.launchcode.projectliftoff.controllers;

import org.launchcode.projectliftoff.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    //localhost:8080/confirm
    @GetMapping("confirm")
    public String showUserLandingPage(Model model) {
        model.addAttribute("userName", "userName");
        model.addAttribute("password", userRepository.findAll());
            return "voters/confirm";
    }

}


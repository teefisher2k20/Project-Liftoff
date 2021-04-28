package org.launchcode.projectliftoff.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    private static List<Object> userConfirmationPage = new ArrayList<>();

    //localhost:8080/confirm
    @GetMapping("confirm")
    public String showUserLandingPage(Model model) {
        model.addAttribute("userConfirmationPage", userConfirmationPage);
        return "voters/confirm";
    }

}


package org.launchcode.projectliftoff.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    private static List<Object> userConfirmationPage = new ArrayList<>();

    //localhost:8080/user/confirm
    @GetMapping("confirm")
    public String showUserLandingPage(Model model) {
        model.addAttribute("userConfirmationPage", userConfirmationPage);
        return "voters/confirm";
    }


    //localhost:8080/user/create
    @GetMapping("create")
    public String createNewVoterForm(Model model) {

        return "voters/register";
    }
    //posts the voter confirmation page
    @PostMapping("create")
    public String confirmNewVoter(@ModelAttribute UserController newUserRegistration) {
        userConfirmationPage.add(newUserRegistration);

        return "voters/confirm";
    }
}

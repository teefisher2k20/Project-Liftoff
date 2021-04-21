package org.launchcode.projectliftoff.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("voters")
public class HomePageController {

    private static List<String> landingPage = new ArrayList<>();

    //localhost:8080/voters
    @GetMapping
    public String showLandingPage(Model model) {
        model.addAttribute("landingPage", landingPage);

        return "index";
    }
//localhost:8080/voters/create
    @GetMapping("create")
    public String createNewVoterForm(Model model) {

        return "voters/register";
    }

    @PostMapping("create")
    public String confirmNewVoter(@RequestParam String firstName) {
        landingPage.add(firstName);
        return "voters/confirm";
    }


}

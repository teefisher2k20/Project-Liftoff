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
@RequestMapping("candidate")
public class CandidateController {

    private static List<String> candidateConfirmationPage = new ArrayList<>();

    //localhost:8080/candidate/confirm
    @GetMapping("confirm")
    public String showCandidateLandingPage(Model model) {
        model.addAttribute("candidateConfirmationPage", candidateConfirmationPage);
        return "candidates/confirm";
    }
    //localhost:8080/candidate/create
    @GetMapping("create")
    public String createNewCandidate(Model model) {
        return "candidates/register";
    }

    //posts the candidate confimation page
    @PostMapping("create")
    public String confirmNewCandidate(@RequestParam String firstName) {
        candidateConfirmationPage.add(firstName);
        return "candidates/confirm";
    }
}

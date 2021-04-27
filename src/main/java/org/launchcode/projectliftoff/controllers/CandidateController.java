package org.launchcode.projectliftoff.controllers;

import org.launchcode.projectliftoff.models.CandidateRegistration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("candidate")
public class CandidateController {

    private static List<Object> candidateConfirmationPage = new ArrayList<>();

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
    public String confirmNewCandidate(@ModelAttribute CandidateRegistration newCandidateRegistration) {
        candidateConfirmationPage.add(newCandidateRegistration);
        return "candidates/confirm";
    }
}

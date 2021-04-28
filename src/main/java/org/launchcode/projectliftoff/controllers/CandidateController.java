package org.launchcode.projectliftoff.controllers;

import org.launchcode.projectliftoff.data.CandidateRepository;
import org.launchcode.projectliftoff.models.CandidateRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("candidate")
public class CandidateController {

    @Autowired
    private CandidateRepository candidateRepository;



    //localhost:8080/candidate/confirm
    @GetMapping("confirm")
    public String showCandidateLandingPage(Model model) {
    model.addAttribute("userName", "userName");
    model.addAttribute("firstName", candidateRepository.findAll());
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
        candidateRepository.save(newCandidateRegistration);
        return "candidates/confirm";
    }
}

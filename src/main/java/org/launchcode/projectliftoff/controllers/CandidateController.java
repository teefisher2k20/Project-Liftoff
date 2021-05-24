package org.launchcode.projectliftoff.controllers;

import org.launchcode.projectliftoff.data.CandidateRepository;
import org.launchcode.projectliftoff.models.CandidateRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.model.IModel;

import java.util.ArrayList;

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
        model.addAttribute("userName", "userName");
        model.addAttribute("firstName", candidateRepository.findAll());

        return "candidates/register";
    }

    //posts the candidate confirmation page
    @PostMapping("confirm")
    public String confirmNewCandidate( Model model) {
        String userName = "";
        String firstName = "";
        String lastName = "";
        ArrayList<String>candidateInfo = new ArrayList<>();
        candidateInfo.add("userName");
        candidateInfo.add("firstName");
        candidateInfo.add("lastName");
        model.addAttribute("userName", userName);
        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);

        return "candidates/confirm";
    }
}

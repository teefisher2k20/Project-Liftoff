package org.launchcode.projectliftoff.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("candidate")
public class CandidateController {

    //localhost:8080/candidate/create
    @GetMapping("create")
    public String createNewCandidate() {
        return "candidates/register";
    }
}

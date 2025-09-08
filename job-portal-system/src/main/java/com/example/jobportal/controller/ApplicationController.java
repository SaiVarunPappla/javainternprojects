package com.example.jobportal.controller;

import com.example.jobportal.model.Application;
import com.example.jobportal.repository.ApplicationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {
    private final ApplicationRepository appRepo;

    public ApplicationController(ApplicationRepository appRepo) {
        this.appRepo = appRepo;
    }

    @GetMapping
    public List<Application> getAllApplications() {
        return appRepo.findAll();
    }

    @PostMapping
    public Application applyForJob(@RequestBody Application application) {
        application.setStatus("APPLIED");
        return appRepo.save(application);
    }
}
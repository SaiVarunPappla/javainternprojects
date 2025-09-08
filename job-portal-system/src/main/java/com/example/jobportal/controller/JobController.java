package com.example.jobportal.controller;

import com.example.jobportal.model.Job;
import com.example.jobportal.repository.JobRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {
    private final JobRepository jobRepo;

    public JobController(JobRepository jobRepo) {
        this.jobRepo = jobRepo;
    }

    @GetMapping
    public List<Job> getAllJobs() {
        return jobRepo.findAll();
    }

    @PostMapping
    public Job createJob(@RequestBody Job job) {
        return jobRepo.save(job);
    }
}
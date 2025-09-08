package com.example.jobportal.model;

import jakarta.persistence.*;

@Entity
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Job job;

    @ManyToOne
    private User applicant;

    private String status; // APPLIED, REVIEWED, ACCEPTED, REJECTED

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Job getJob() { return job; }
    public void setJob(Job job) { this.job = job; }

    public User getApplicant() { return applicant; }
    public void setApplicant(User applicant) { this.applicant = applicant; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
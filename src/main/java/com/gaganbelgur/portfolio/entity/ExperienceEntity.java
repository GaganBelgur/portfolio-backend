package com.gaganbelgur.portfolio.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "experience")
public class ExperienceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String role;

    private String duration;

    @Column(columnDefinition = "TEXT")
    private String summary;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getDuration() {
        return duration;
    }

    public String getSummary() {
        return summary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}

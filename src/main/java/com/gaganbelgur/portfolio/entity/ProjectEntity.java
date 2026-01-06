package com.gaganbelgur.portfolio.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "project")
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    private List<String> techTags;

    private String companyTags;

    // Getters and Setters

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getTechTags() {
        return techTags;
    }

    public String getCompanyTags() {
        return companyTags;
    }
}

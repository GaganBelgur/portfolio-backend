package com.gaganbelgur.portfolio.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "project")
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    private Set<String> techTags;

    private String companyTags;

    // Getters and Setters

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Set<String> getTechTags() {
        return techTags;
    }

    public String getCompanyTags() {
        return companyTags;
    }
}

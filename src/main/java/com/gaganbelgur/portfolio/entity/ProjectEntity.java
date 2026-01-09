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

    @Column(columnDefinition = "TEXT")
    private String description;

    private Set<String> techTags;

    private String companyTags;

    public Long getId() {
        return id;
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTechTags(Set<String> techTags) {
        this.techTags = techTags;
    }

    public void setCompanyTags(String companyTags) {
        this.companyTags = companyTags;
    }
}

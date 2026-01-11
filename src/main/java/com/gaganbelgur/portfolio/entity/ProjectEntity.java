package com.gaganbelgur.portfolio.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "project")
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(
            name = "tech_tags",
            columnDefinition = "TEXT[]"
    )
    private String[] techTags;

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

    public String[] getTechTags() {
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

    public void setTechTags(String[] techTags) {
        this.techTags = techTags;
    }

    public void setCompanyTags(String companyTags) {
        this.companyTags = companyTags;
    }
}

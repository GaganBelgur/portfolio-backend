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

    @Lob
    @Column(columnDefinition = "TEXT")
    private String summary;

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

}

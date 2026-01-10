package com.gaganbelgur.portfolio.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "professional_summary")
public class ProfessionalSummaryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String summary;

    public Long getId() {
        return id;
    }

    public String getSummary() {
        return summary;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}

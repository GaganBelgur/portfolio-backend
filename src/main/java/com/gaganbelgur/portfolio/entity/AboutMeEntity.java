package com.gaganbelgur.portfolio.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "about_me")
public class AboutMeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String title;

    @Column(columnDefinition = "TEXT")
    private String summary;

    private String profile_image_url;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }

    public String getProfile_image_url() {
        return profile_image_url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }
}

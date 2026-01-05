package com.gaganbelgur.portfolio.dto;

public record ExperienceResponse(String name, String role, String duration, String summary) {
    @Override
    public String name() {
        return name;
    }

    @Override
    public String role() {
        return role;
    }

    @Override
    public String duration() {
        return duration;
    }

    @Override
    public String summary() {
        return summary;
    }
}

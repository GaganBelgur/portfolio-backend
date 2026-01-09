package com.gaganbelgur.portfolio.dto.admins;

public record ExperienceAdminResponse(long id, String name, String role, String duration, String summary) {
    @Override
    public long id() {
        return id;
    }

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

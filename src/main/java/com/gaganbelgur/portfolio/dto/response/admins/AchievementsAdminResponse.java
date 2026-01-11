package com.gaganbelgur.portfolio.dto.response.admins;

public record AchievementsAdminResponse(Long id, String imageUrl, String title, String description, String year) {
    @Override
    public String imageUrl() {
        return imageUrl;
    }

    @Override
    public String title() {
        return title;
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public String year() {
        return year;
    }

    @Override
    public Long id() {
        return id;
    }
}

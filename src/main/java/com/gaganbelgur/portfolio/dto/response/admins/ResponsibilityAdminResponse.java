package com.gaganbelgur.portfolio.dto.response.admins;

public record ResponsibilityAdminResponse(Long id, String imageUrl, String title, String description) {

    @Override
    public Long id() {
        return id;
    }

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

}

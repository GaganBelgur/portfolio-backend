package com.gaganbelgur.portfolio.dto.response.publics;

public record ResponsibilityResponse(String imageUrl, String title, String description) {

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

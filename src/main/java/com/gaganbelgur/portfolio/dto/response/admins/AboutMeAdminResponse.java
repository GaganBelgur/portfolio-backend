package com.gaganbelgur.portfolio.dto.response.admins;

public record AboutMeAdminResponse(long id, String name, String title, String summary, String profile_image_url) {

    @Override
    public long id() {
        return id;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String title() {
        return title;
    }

    @Override
    public String summary() {
        return summary;
    }

    @Override
    public String profile_image_url() {
        return profile_image_url;
    }
}

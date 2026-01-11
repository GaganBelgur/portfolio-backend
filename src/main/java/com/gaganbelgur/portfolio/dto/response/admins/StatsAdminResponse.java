package com.gaganbelgur.portfolio.dto.response.admins;

public record StatsAdminResponse(Long id, String name, String title, int count) {

    @Override
    public Long id() {
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
    public int count() {
        return count;
    }
}

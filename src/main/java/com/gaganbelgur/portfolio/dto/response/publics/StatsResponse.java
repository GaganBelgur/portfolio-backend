package com.gaganbelgur.portfolio.dto.response.publics;

public record StatsResponse(String name, String title, int count) {

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

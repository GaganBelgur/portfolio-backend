package com.gaganbelgur.portfolio.dto.response.publics;

import java.util.Set;

public record ProjectResponse(String name, String description, String[] techTags, String companyTags) {

    @Override
    public String name() {
        return name;
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public String[] techTags() {
        return techTags;
    }

    @Override
    public String companyTags() {
        return companyTags;
    }
}

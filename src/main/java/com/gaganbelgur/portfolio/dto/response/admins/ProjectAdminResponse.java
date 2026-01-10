package com.gaganbelgur.portfolio.dto.response.admins;

import java.util.Set;

public record ProjectAdminResponse(long id, String name, String description, String[] techTags, String companyTags) {

    @Override
    public long id() {
        return id;
    }

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

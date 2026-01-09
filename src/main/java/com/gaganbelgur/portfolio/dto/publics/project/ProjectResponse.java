package com.gaganbelgur.portfolio.dto.publics.project;

import java.util.Set;

public record ProjectResponse(String name, String description, Set<String> techTags, String companyTags) {

    @Override
    public String name() {
        return name;
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public Set<String> techTags() {
        return techTags;
    }

    @Override
    public String companyTags() {
        return companyTags;
    }
}

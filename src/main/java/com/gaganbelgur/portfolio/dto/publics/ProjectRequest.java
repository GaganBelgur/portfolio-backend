package com.gaganbelgur.portfolio.dto.publics;

import java.util.Set;

public class ProjectRequest {
    private String name;
    private String description;
    private Set<String> techTags;
    private String companyTags;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Set<String> getTechTags() {
        return techTags;
    }

    public String getCompanyTags() {
        return companyTags;
    }
}

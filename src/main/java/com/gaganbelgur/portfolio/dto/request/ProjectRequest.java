package com.gaganbelgur.portfolio.dto.request;

public class ProjectRequest {
    private String name;
    private String description;
    private String[] techTags;
    private String companyTags;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String[] getTechTags() {
        return techTags;
    }

    public String getCompanyTags() {
        return companyTags;
    }
}

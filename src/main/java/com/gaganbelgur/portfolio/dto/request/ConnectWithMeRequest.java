package com.gaganbelgur.portfolio.dto.request;

public class ConnectWithMeRequest {

    private String summary;
    private String linkedin_url;
    private String github_url;
    private String email;
    private String portfolio_url;

    public String getSummary() {
        return summary;
    }

    public String getLinkedin_url() {
        return linkedin_url;
    }

    public String getGithub_url() {
        return github_url;
    }

    public String getEmail() {
        return email;
    }

    public String getPortfolio_url() {
        return portfolio_url;
    }
}

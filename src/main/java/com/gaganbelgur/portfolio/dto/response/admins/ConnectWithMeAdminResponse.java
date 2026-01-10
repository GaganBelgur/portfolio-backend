package com.gaganbelgur.portfolio.dto.response.admins;

public record ConnectWithMeAdminResponse(long id, String summary, String linkedin_url, String github_url, String email, String portfolio_url) {

    @Override
    public long id() {
        return id;
    }

    @Override
    public String summary() {
        return summary;
    }

    @Override
    public String linkedin_url() {
        return linkedin_url;
    }

    @Override
    public String github_url() {
        return github_url;
    }

    @Override
    public String email() {
        return email;
    }

    @Override
    public String portfolio_url() {
        return portfolio_url;
    }
}

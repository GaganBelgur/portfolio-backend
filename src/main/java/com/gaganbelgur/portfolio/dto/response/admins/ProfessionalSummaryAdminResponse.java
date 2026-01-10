package com.gaganbelgur.portfolio.dto.response.admins;

public record ProfessionalSummaryAdminResponse(long id, String summary) {

    @Override
    public long id() {
        return id;
    }

    @Override
    public String summary() {
        return summary;
    }
}

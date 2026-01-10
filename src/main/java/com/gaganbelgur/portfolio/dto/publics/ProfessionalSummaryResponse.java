package com.gaganbelgur.portfolio.dto.publics;

public record ProfessionalSummaryResponse(long id, String summary) {

    @Override
    public long id() {
        return id;
    }

    @Override
    public String summary() {
        return summary;
    }
}

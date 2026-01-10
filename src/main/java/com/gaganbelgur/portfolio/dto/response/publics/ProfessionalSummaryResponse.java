package com.gaganbelgur.portfolio.dto.response.publics;

public record ProfessionalSummaryResponse(String summary) {

    @Override
    public String summary() {
        return summary;
    }
}

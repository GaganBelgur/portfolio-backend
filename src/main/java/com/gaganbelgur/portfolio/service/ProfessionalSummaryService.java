package com.gaganbelgur.portfolio.service;

import com.gaganbelgur.portfolio.dto.request.ProfessionalSummaryRequest;
import com.gaganbelgur.portfolio.dto.response.admins.ProfessionalSummaryAdminResponse;
import com.gaganbelgur.portfolio.dto.response.publics.ProfessionalSummaryResponse;

public interface ProfessionalSummaryService {

    ProfessionalSummaryResponse getProfessionalSummary();

    ProfessionalSummaryAdminResponse createProfessionalSummary(ProfessionalSummaryRequest request);

    ProfessionalSummaryAdminResponse updateProfessionalSummary(Long id, ProfessionalSummaryRequest request);

    void deleteProfessionalSummary(Long id);
}

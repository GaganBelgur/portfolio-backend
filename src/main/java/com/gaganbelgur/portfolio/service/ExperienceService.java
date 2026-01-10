package com.gaganbelgur.portfolio.service;

import com.gaganbelgur.portfolio.dto.response.admins.ExperienceAdminResponse;
import com.gaganbelgur.portfolio.dto.request.ExperienceRequest;
import com.gaganbelgur.portfolio.dto.response.publics.ExperienceResponse;

import java.util.List;

public interface ExperienceService {
    List<ExperienceResponse> getExperiences();

    List<ExperienceAdminResponse> getAllAdminExperiences();

    ExperienceAdminResponse createExperience(ExperienceRequest request);

    ExperienceAdminResponse updateExperience(Long id, ExperienceRequest request);

    void deleteExperience(Long id);
}


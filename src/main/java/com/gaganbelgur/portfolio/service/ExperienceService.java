package com.gaganbelgur.portfolio.service;

import com.gaganbelgur.portfolio.dto.admins.ExperienceAdminResponse;
import com.gaganbelgur.portfolio.dto.publics.ExperienceRequest;
import com.gaganbelgur.portfolio.dto.publics.ExperienceResponse;

import java.util.List;

public interface ExperienceService {
    List<ExperienceResponse> getExperiences();

    List<ExperienceAdminResponse> getAllAdminExperiences();

    ExperienceAdminResponse createExperience(ExperienceRequest request);

    ExperienceAdminResponse updateExperience(Long id, ExperienceRequest request);

    void deleteExperience(Long id);
}


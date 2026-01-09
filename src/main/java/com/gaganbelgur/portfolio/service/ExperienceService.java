package com.gaganbelgur.portfolio.service;

import com.gaganbelgur.portfolio.dto.admins.experience.ExperienceAdminResponse;
import com.gaganbelgur.portfolio.dto.publics.experience.ExperienceRequest;
import com.gaganbelgur.portfolio.dto.publics.experience.ExperienceResponse;

import java.util.List;

public interface ExperienceService {
    List<ExperienceResponse> getExperiences();

    List<ExperienceAdminResponse> getAllAdminExperiences();

    ExperienceAdminResponse createExperience(ExperienceRequest request);

    ExperienceAdminResponse updateExperience(Long id, ExperienceRequest request);

    void deleteExperience(Long id);
}


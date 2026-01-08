package com.gaganbelgur.portfolio.service;

import com.gaganbelgur.portfolio.dto.experience.ExperienceRequest;
import com.gaganbelgur.portfolio.dto.experience.ExperienceResponse;

import java.util.List;

public interface ExperienceService {
    List<ExperienceResponse> getExperiences();

    ExperienceResponse createExperience(ExperienceRequest request);

    ExperienceResponse updateExperience(Long id, ExperienceRequest request);

    void deleteExperience(Long id);
}


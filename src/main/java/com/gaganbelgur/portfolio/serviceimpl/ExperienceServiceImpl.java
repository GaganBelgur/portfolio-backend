package com.gaganbelgur.portfolio.serviceimpl;

import com.gaganbelgur.portfolio.dto.ExperienceResponse;
import com.gaganbelgur.portfolio.entity.ExperienceEntity;
import com.gaganbelgur.portfolio.repository.ExperienceRepository;
import com.gaganbelgur.portfolio.service.ExperienceService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExperienceServiceImpl implements ExperienceService {

    private final ExperienceRepository experienceRepository;

    public ExperienceServiceImpl(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    @Override
    public List<ExperienceResponse> getExperiences() {
        List<ExperienceEntity> experiences = experienceRepository.findTopByOrderByIdAsc();

        List<ExperienceResponse> responses = new ArrayList<>();

        experiences.forEach(experienceEntity -> {
            ExperienceResponse response = new ExperienceResponse(
                    experienceEntity.getName(),
                    experienceEntity.getRole(),
                    experienceEntity.getDuration(),
                    experienceEntity.getSummary()
            );
            responses.add(response);
        });

        return responses;
    }
}

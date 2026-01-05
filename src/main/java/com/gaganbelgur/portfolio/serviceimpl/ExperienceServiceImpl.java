package com.gaganbelgur.portfolio.serviceimpl;

import com.gaganbelgur.portfolio.dto.ExperienceResponse;
import com.gaganbelgur.portfolio.entity.ExperienceEntity;
import com.gaganbelgur.portfolio.repository.ExperienceRepository;
import com.gaganbelgur.portfolio.service.ExperienceService;
import org.springframework.stereotype.Service;

@Service
public class ExperienceServiceImpl implements ExperienceService {

    private final ExperienceRepository experienceRepository;

    public ExperienceServiceImpl(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    @Override
    public ExperienceResponse getProfile() {
        ExperienceEntity experienceEntity = experienceRepository.findTopByOrderByIdAsc();
        if (experienceEntity != null) {
            return new ExperienceResponse(
                    experienceEntity.getName(),
                    experienceEntity.getRole(),
                    experienceEntity.getDuration(),
                    experienceEntity.getSummary()
            );
        }
        return null;
    }
}

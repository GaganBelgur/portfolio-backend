package com.gaganbelgur.portfolio.serviceimpl;

import com.gaganbelgur.portfolio.dto.admins.ExperienceAdminResponse;
import com.gaganbelgur.portfolio.dto.publics.ExperienceRequest;
import com.gaganbelgur.portfolio.dto.publics.ExperienceResponse;
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
        List<ExperienceEntity> experiences = experienceRepository.findAll();

        List<ExperienceResponse> responses = new ArrayList<>();

        experiences.forEach(experienceEntity -> {
            ExperienceResponse response = map(experienceEntity);
            responses.add(response);
        });

        return responses;
    }

    @Override
    public List<ExperienceAdminResponse> getAllAdminExperiences() {
        List<ExperienceEntity> experiences = experienceRepository.findAll();

        List<ExperienceAdminResponse> responses = new ArrayList<>();

        experiences.forEach(experienceEntity -> {
            ExperienceAdminResponse response = mapAdmin(experienceEntity);
            responses.add(response);
        });

        return responses;
    }

    @Override
    public ExperienceAdminResponse createExperience(ExperienceRequest request) {
        ExperienceEntity entity = new ExperienceEntity();
        updateEntityFromRequest(entity, request);
        experienceRepository.save(entity);
        return mapAdmin(entity);
    }

    @Override
    public ExperienceAdminResponse updateExperience(Long id, ExperienceRequest request) {
        ExperienceEntity experienceEntity = experienceRepository.findById(id).orElseThrow();
        updateEntityFromRequest(experienceEntity, request);
        experienceRepository.save(experienceEntity);
        return mapAdmin(experienceEntity);
    }

    @Override
    public void deleteExperience(Long id) {
        experienceRepository.deleteById(id);
    }

    private void updateEntityFromRequest(ExperienceEntity entity, ExperienceRequest request) {
        entity.setName(request.getName());
        entity.setRole(request.getRole());
        entity.setDuration(request.getDuration());
        entity.setSummary(request.getSummary());
    }

    private ExperienceResponse map(ExperienceEntity entity) {
        return new ExperienceResponse(
                entity.getName(),
                entity.getRole(),
                entity.getDuration(),
                entity.getSummary()
        );
    }

    private ExperienceAdminResponse mapAdmin(ExperienceEntity e) {
        return new ExperienceAdminResponse(
                e.getId(),
                e.getName(),
                e.getRole(),
                e.getDuration(),
                e.getSummary()
        );
    }
}

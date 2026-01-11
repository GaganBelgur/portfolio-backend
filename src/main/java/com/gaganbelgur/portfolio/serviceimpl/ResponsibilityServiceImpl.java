package com.gaganbelgur.portfolio.serviceimpl;

import com.gaganbelgur.portfolio.dto.request.ResponsibilityRequest;
import com.gaganbelgur.portfolio.dto.response.admins.ResponsibilityAdminResponse;
import com.gaganbelgur.portfolio.dto.response.publics.ResponsibilityResponse;
import com.gaganbelgur.portfolio.entity.ResponsibilityEntity;
import com.gaganbelgur.portfolio.repository.ResponsibilityRepository;
import com.gaganbelgur.portfolio.service.ResponsibilityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponsibilityServiceImpl implements ResponsibilityService {

    private final ResponsibilityRepository repository;

    public ResponsibilityServiceImpl(ResponsibilityRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ResponsibilityResponse> getResponsibilities() {
        return repository.findAll().stream().map(this::map).toList();
    }

    @Override
    public List<ResponsibilityAdminResponse> getResponsibilitiesForAdmin() {
        return repository.findAll().stream().map(this::mapAdmin).toList();
    }

    @Override
    public ResponsibilityAdminResponse createResponsibility(ResponsibilityRequest request) {
        ResponsibilityEntity entity = new ResponsibilityEntity();
        updateEntityFromRequest(entity, request);
        repository.save(entity);
        return mapAdmin(entity);
    }

    @Override
    public ResponsibilityAdminResponse updateResponsibility(Long id, ResponsibilityRequest request) {
        ResponsibilityEntity entity = repository.findById(id).orElseThrow();
        updateEntityFromRequest(entity, request);
        repository.save(entity);
        return mapAdmin(entity);
    }

    @Override
    public void deleteResponsibility(Long id) {
        repository.deleteById(id);
    }

    private ResponsibilityResponse map(ResponsibilityEntity entity) {
        return new ResponsibilityResponse(
                entity.getImageUrl(),
                entity.getTitle(),
                entity.getDescription()
        );
    }

    private void updateEntityFromRequest(ResponsibilityEntity entity, ResponsibilityRequest request) {
        entity.setImageUrl(request.getImageUrl());
        entity.setTitle(request.getTitle());
        entity.setDescription(request.getDescription());
    }

    private ResponsibilityAdminResponse mapAdmin(ResponsibilityEntity entity) {
        return new ResponsibilityAdminResponse(
                entity.getId(),
                entity.getImageUrl(),
                entity.getTitle(),
                entity.getDescription()
        );
    }
}

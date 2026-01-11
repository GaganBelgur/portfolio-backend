package com.gaganbelgur.portfolio.serviceimpl;

import com.gaganbelgur.portfolio.dto.request.AchievementsRequest;
import com.gaganbelgur.portfolio.dto.response.admins.AchievementsAdminResponse;
import com.gaganbelgur.portfolio.dto.response.publics.AchievementsResponse;
import com.gaganbelgur.portfolio.entity.AchievementsEntity;
import com.gaganbelgur.portfolio.repository.AchievementsRepository;
import com.gaganbelgur.portfolio.service.AchievementsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AchievementsServiceImpl implements AchievementsService {

    private final AchievementsRepository achievementsRepository;

    public AchievementsServiceImpl(AchievementsRepository achievementsRepository) {
        this.achievementsRepository = achievementsRepository;
    }

    @Override
    public List<AchievementsResponse> getAchievements() {
        return achievementsRepository.findAll().stream().map(this::map).toList();
    }

    @Override
    public List<AchievementsAdminResponse> getAchievementsForAdmin() {
        return achievementsRepository.findAll().stream().map(this::mapAdmin).toList();
    }

    @Override
    public AchievementsAdminResponse createAchievement(AchievementsRequest request) {
        AchievementsEntity entity = new AchievementsEntity();
        updateEntityFromRequest(entity, request);
        achievementsRepository.save(entity);
        return mapAdmin(entity);
    }

    @Override
    public AchievementsAdminResponse updateAchievement(Long id, AchievementsRequest request) {
        AchievementsEntity entity = achievementsRepository.findById(id).orElseThrow();
        updateEntityFromRequest(entity, request);
        achievementsRepository.save(entity);
        return mapAdmin(entity);
    }

    @Override
    public void deleteAchievement(Long id) {
        achievementsRepository.deleteById(id);
    }

    private AchievementsResponse map(AchievementsEntity entity) {
        return new AchievementsResponse(
                entity.getImageUrl(),
                entity.getTitle(),
                entity.getDescription(),
                entity.getYear()
        );
    }

    private void updateEntityFromRequest(AchievementsEntity entity, AchievementsRequest request) {
        entity.setImageUrl(request.getImageUrl());
        entity.setTitle(request.getTitle());
        entity.setDescription(request.getDescription());
        entity.setYear(request.getYear());
    }

    private AchievementsAdminResponse mapAdmin(AchievementsEntity entity) {
        return new AchievementsAdminResponse(
                entity.getId(),
                entity.getImageUrl(),
                entity.getTitle(),
                entity.getDescription(),
                entity.getYear()
        );
    }
}

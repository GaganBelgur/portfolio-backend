package com.gaganbelgur.portfolio.service;

import com.gaganbelgur.portfolio.dto.request.AchievementsRequest;
import com.gaganbelgur.portfolio.dto.response.admins.AchievementsAdminResponse;
import com.gaganbelgur.portfolio.dto.response.publics.AchievementsResponse;

import java.util.List;

public interface AchievementsService {

    List<AchievementsResponse> getAchievements();

    List<AchievementsAdminResponse> getAchievementsForAdmin();

    AchievementsAdminResponse createAchievement(AchievementsRequest request);

    AchievementsAdminResponse updateAchievement(Long id, AchievementsRequest request);

    void deleteAchievement(Long id);
}

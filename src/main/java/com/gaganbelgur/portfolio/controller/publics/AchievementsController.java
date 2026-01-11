package com.gaganbelgur.portfolio.controller.publics;

import com.gaganbelgur.portfolio.dto.response.publics.AchievementsResponse;
import com.gaganbelgur.portfolio.service.AchievementsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/achievements")
public class AchievementsController {

    private final AchievementsService service;

    public AchievementsController(AchievementsService service) {
        this.service = service;
    }

    @GetMapping
    public List<AchievementsResponse> getAchievements() {
        return service.getAchievements();
    }
}

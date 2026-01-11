package com.gaganbelgur.portfolio.controller.admins;

import com.gaganbelgur.portfolio.dto.request.AchievementsRequest;
import com.gaganbelgur.portfolio.dto.response.admins.AchievementsAdminResponse;
import com.gaganbelgur.portfolio.dto.response.publics.AchievementsResponse;
import com.gaganbelgur.portfolio.service.AchievementsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/achievements")
public class AchievementsAdminController {

    private final AchievementsService service;

    public AchievementsAdminController(AchievementsService service) {
        this.service = service;
    }

    @GetMapping
    public List<AchievementsAdminResponse> getAchievements() {
        return service.getAchievementsForAdmin();
    }

    @PostMapping
    public AchievementsAdminResponse createAchievement(@RequestBody AchievementsRequest request) {
        return service.createAchievement(request);
    }

    @PutMapping("/{id}")
    public AchievementsAdminResponse updateAchievement(@PathVariable Long id, @RequestBody AchievementsRequest request) {
        return service.updateAchievement(id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteAchievement(@PathVariable Long id) {
        service.deleteAchievement(id);
    }
}

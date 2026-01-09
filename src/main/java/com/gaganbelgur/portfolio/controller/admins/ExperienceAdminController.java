package com.gaganbelgur.portfolio.controller.admins;

import com.gaganbelgur.portfolio.dto.admins.ExperienceAdminResponse;
import com.gaganbelgur.portfolio.dto.publics.ExperienceRequest;
import com.gaganbelgur.portfolio.service.ExperienceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/admin/experience")
public class ExperienceAdminController {

    private final ExperienceService experienceService;

    public ExperienceAdminController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @GetMapping
    public List<ExperienceAdminResponse> getExperiences() {
        return experienceService.getAllAdminExperiences();
    }

    @PostMapping
    public ExperienceAdminResponse createExperience(@RequestBody ExperienceRequest request) {
        return experienceService.createExperience(request);
    }

    @PutMapping("/{id}")
    public ExperienceAdminResponse updateExperience(@PathVariable Long id, @RequestBody ExperienceRequest request) {
        return experienceService.updateExperience(id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteExperience(@PathVariable Long id) {
        experienceService.deleteExperience(id);
    }
}

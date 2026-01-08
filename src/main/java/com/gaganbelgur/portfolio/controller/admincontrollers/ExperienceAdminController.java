package com.gaganbelgur.portfolio.controller.admincontrollers;

import com.gaganbelgur.portfolio.dto.experience.ExperienceRequest;
import com.gaganbelgur.portfolio.dto.experience.ExperienceResponse;
import com.gaganbelgur.portfolio.service.ExperienceService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/admin/experience")
public class ExperienceAdminController {

    private final ExperienceService experienceService;

    public ExperienceAdminController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @PostMapping
    public ExperienceResponse createExperience(@RequestBody ExperienceRequest request) {
        return experienceService.createExperience(request);
    }

    @PutMapping("/{id}")
    public ExperienceResponse updateExperience(@PathVariable Long id, @RequestBody ExperienceRequest request) {
        return experienceService.updateExperience(id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteExperience(@PathVariable Long id) {
        experienceService.deleteExperience(id);
    }
}

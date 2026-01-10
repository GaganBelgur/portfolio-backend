package com.gaganbelgur.portfolio.controller.admins;

import com.gaganbelgur.portfolio.dto.response.admins.ProjectAdminResponse;
import com.gaganbelgur.portfolio.dto.request.ProjectRequest;
import com.gaganbelgur.portfolio.service.ProjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/project")
public class ProjectAdminController {

    private final ProjectService projectService;

    public ProjectAdminController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    public List<ProjectAdminResponse> getProjects() {
        return projectService.getProjectsAdmin();
    }

    @PostMapping
    public ProjectAdminResponse createProject(@RequestBody ProjectRequest request) {
        return projectService.createProject(request);
    }

    @PutMapping("/{id}")
    public ProjectAdminResponse updateProject(@PathVariable Long id, @RequestBody ProjectRequest request) {
        return projectService.updateProject(id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable Long id) {
        projectService.deleteProject(id);
    }
}

package com.gaganbelgur.portfolio.serviceimpl;

import com.gaganbelgur.portfolio.dto.response.admins.ProjectAdminResponse;
import com.gaganbelgur.portfolio.dto.request.ProjectRequest;
import com.gaganbelgur.portfolio.dto.response.publics.ProjectResponse;
import com.gaganbelgur.portfolio.entity.ProjectEntity;
import com.gaganbelgur.portfolio.repository.ProjectRepository;
import com.gaganbelgur.portfolio.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public List<ProjectResponse> getProjects() {
        return projectRepository.findAll().stream()
                .map(this::map)
                .toList();
    }

    @Override
    public List<ProjectAdminResponse> getProjectsAdmin() {
        return projectRepository.findAll().stream()
                .map(this::mapAdmin)
                .toList();
    }

    @Override
    public ProjectAdminResponse createProject(ProjectRequest request) {
        ProjectEntity entity = new ProjectEntity();
        updateEntityFromRequest(entity, request);
        projectRepository.save(entity);
        return mapAdmin(entity);
    }

    @Override
    public ProjectAdminResponse updateProject(Long id, ProjectRequest request) {
        ProjectEntity entity = projectRepository.findById(id).orElseThrow();
        updateEntityFromRequest(entity, request);
        projectRepository.save(entity);
        return mapAdmin(entity);
    }

    @Override
    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }

    private void updateEntityFromRequest(ProjectEntity entity, ProjectRequest request) {
        entity.setName(request.getName());
        entity.setDescription(request.getDescription());
        entity.setTechTags(request.getTechTags());
        entity.setCompanyTags(request.getCompanyTags());
    }

    private ProjectResponse map(ProjectEntity entity) {
        return new ProjectResponse(
                entity.getName(),
                entity.getDescription(),
                entity.getTechTags(),
                entity.getCompanyTags()
        );
    }

    private ProjectAdminResponse mapAdmin(ProjectEntity entity) {
        return new ProjectAdminResponse(
                entity.getId(),
                entity.getName(),
                entity.getDescription(),
                entity.getTechTags(),
                entity.getCompanyTags()
        );
    }
}

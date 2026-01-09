package com.gaganbelgur.portfolio.serviceimpl;

import com.gaganbelgur.portfolio.dto.publics.project.ProjectResponse;
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
        List<ProjectEntity> projectEntity = projectRepository.findAll();

        return projectEntity.stream()
                .map(this::map)
                .toList();
    }

    private ProjectResponse map(ProjectEntity entity) {
        return new ProjectResponse(
                entity.getName(),
                entity.getDescription(),
                entity.getTechTags(),
                entity.getCompanyTags()
        );
    }
}

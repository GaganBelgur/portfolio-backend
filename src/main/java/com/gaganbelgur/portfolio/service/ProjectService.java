package com.gaganbelgur.portfolio.service;

import com.gaganbelgur.portfolio.dto.response.admins.ProjectAdminResponse;
import com.gaganbelgur.portfolio.dto.request.ProjectRequest;
import com.gaganbelgur.portfolio.dto.response.publics.ProjectResponse;

import java.util.List;

public interface ProjectService {

    List<ProjectResponse> getProjects();

    List<ProjectAdminResponse> getProjectsAdmin();

    ProjectAdminResponse createProject(ProjectRequest request);

    ProjectAdminResponse updateProject(Long id, ProjectRequest request);

    void deleteProject(Long id);
}

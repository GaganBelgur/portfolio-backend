package com.gaganbelgur.portfolio.service;

import com.gaganbelgur.portfolio.dto.request.ResponsibilityRequest;
import com.gaganbelgur.portfolio.dto.response.admins.ResponsibilityAdminResponse;
import com.gaganbelgur.portfolio.dto.response.publics.ResponsibilityResponse;

import java.util.List;

public interface ResponsibilityService {

    List<ResponsibilityResponse> getResponsibilities();

    List<ResponsibilityAdminResponse> getResponsibilitiesForAdmin();

    ResponsibilityAdminResponse createResponsibility(ResponsibilityRequest request);

    ResponsibilityAdminResponse updateResponsibility(Long id, ResponsibilityRequest request);

    void deleteResponsibility(Long id);
}

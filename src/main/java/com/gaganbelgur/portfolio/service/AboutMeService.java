package com.gaganbelgur.portfolio.service;

import com.gaganbelgur.portfolio.dto.request.AboutMeRequest;
import com.gaganbelgur.portfolio.dto.response.admins.AboutMeAdminResponse;
import com.gaganbelgur.portfolio.dto.response.publics.AboutMeResponse;

public interface AboutMeService {
    AboutMeResponse getAboutMe();

    AboutMeAdminResponse createAboutMe(AboutMeRequest request);

    AboutMeAdminResponse updateAboutMe(Long id, AboutMeRequest request);

    void deleteAboutMe(Long id);
}

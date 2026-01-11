package com.gaganbelgur.portfolio.service;

import com.gaganbelgur.portfolio.dto.request.StatsRequest;
import com.gaganbelgur.portfolio.dto.response.admins.StatsAdminResponse;
import com.gaganbelgur.portfolio.dto.response.publics.StatsResponse;

import java.util.List;

public interface StatsService {

    List<StatsResponse> getStats();

    List<StatsAdminResponse> getStatsForAdmin();

    StatsAdminResponse createStat(StatsRequest request);

    StatsAdminResponse updateStat(Long id, StatsRequest request);

    void deleteStat(Long id);
}

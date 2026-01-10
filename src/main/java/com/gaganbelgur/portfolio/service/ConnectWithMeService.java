package com.gaganbelgur.portfolio.service;

import com.gaganbelgur.portfolio.dto.request.ConnectWithMeRequest;
import com.gaganbelgur.portfolio.dto.response.admins.ConnectWithMeAdminResponse;
import com.gaganbelgur.portfolio.dto.response.publics.ConnectWithMeResponse;

import java.util.List;

public interface ConnectWithMeService {

    ConnectWithMeResponse getConnectWithMe();

    List<ConnectWithMeAdminResponse> getConnectWithMeAdmin();

    ConnectWithMeAdminResponse createConnectWithMe(ConnectWithMeRequest request);

    ConnectWithMeAdminResponse updateConnectWithMe(Long id, ConnectWithMeRequest request);

    void deleteConnectWithMe(Long id);
}

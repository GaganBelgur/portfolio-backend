package com.gaganbelgur.portfolio.serviceimpl;

import com.gaganbelgur.portfolio.dto.request.ConnectWithMeRequest;
import com.gaganbelgur.portfolio.dto.response.admins.ConnectWithMeAdminResponse;
import com.gaganbelgur.portfolio.dto.response.publics.ConnectWithMeResponse;
import com.gaganbelgur.portfolio.service.ConnectWithMeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConnectWithMeServiceImpl implements ConnectWithMeService {

    @Override
    public ConnectWithMeResponse getConnectWithMe() {
        return null;
    }

    @Override
    public List<ConnectWithMeAdminResponse> getConnectWithMeAdmin() {
        return List.of();
    }

    @Override
    public ConnectWithMeAdminResponse createConnectWithMe(ConnectWithMeRequest request) {
        return null;
    }

    @Override
    public ConnectWithMeAdminResponse updateConnectWithMe(Long id, ConnectWithMeRequest request) {
        return null;
    }

    @Override
    public void deleteConnectWithMe(Long id) {

    }
}

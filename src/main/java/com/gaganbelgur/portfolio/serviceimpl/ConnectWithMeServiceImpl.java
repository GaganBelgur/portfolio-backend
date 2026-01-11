package com.gaganbelgur.portfolio.serviceimpl;

import com.gaganbelgur.portfolio.dto.request.ConnectWithMeRequest;
import com.gaganbelgur.portfolio.dto.response.admins.ConnectWithMeAdminResponse;
import com.gaganbelgur.portfolio.dto.response.publics.ConnectWithMeResponse;
import com.gaganbelgur.portfolio.entity.ConnectWithMeEntity;
import com.gaganbelgur.portfolio.repository.ConnectWithMeRepository;
import com.gaganbelgur.portfolio.service.ConnectWithMeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConnectWithMeServiceImpl implements ConnectWithMeService {

    private final ConnectWithMeRepository repository;

    public ConnectWithMeServiceImpl(ConnectWithMeRepository repository) {
        this.repository = repository;
    }

    @Override
    public ConnectWithMeResponse getConnectWithMe() {
        List<ConnectWithMeEntity> entityList = repository.findAll();

        if (entityList.isEmpty()) {
            return new ConnectWithMeResponse(null, null, null, null, null);
        }

        int entitySize = entityList.size();
        ConnectWithMeEntity entity = entityList.get(entitySize - 1);
        return map(entity);
    }

    @Override
    public List<ConnectWithMeAdminResponse> getConnectWithMeAdmin() {
        List<ConnectWithMeEntity> entityList = repository.findAll();
        return entityList.stream().map(this::mapAdmin).toList();
    }

    @Override
    public ConnectWithMeAdminResponse createConnectWithMe(ConnectWithMeRequest request) {
        ConnectWithMeEntity entity = new ConnectWithMeEntity();
        updateEntityFromRequest(entity, request);
        repository.save(entity);
        return mapAdmin(entity);
    }

    @Override
    public ConnectWithMeAdminResponse updateConnectWithMe(Long id, ConnectWithMeRequest request) {
        ConnectWithMeEntity entity = repository.findById(id).orElseThrow();
        updateEntityFromRequest(entity, request);
        repository.save(entity);
        return mapAdmin(entity);
    }

    @Override
    public void deleteConnectWithMe(Long id) {
        repository.deleteById(id);
    }

    private ConnectWithMeResponse map(ConnectWithMeEntity entity) {
        return new ConnectWithMeResponse(
                entity.getSummary(),
                entity.getLinkedin_url(),
                entity.getGithub_url(),
                entity.getEmail(),
                entity.getPortfolio_url()
        );
    }

    private void updateEntityFromRequest(ConnectWithMeEntity entity, ConnectWithMeRequest request) {
        entity.setSummary(request.getSummary());
        entity.setLinkedin_url(request.getLinkedin_url());
        entity.setGithub_url(request.getGithub_url());
        entity.setEmail(request.getEmail());
        entity.setPortfolio_url(request.getPortfolio_url());
    }

    private ConnectWithMeAdminResponse mapAdmin(ConnectWithMeEntity entity) {
        return new ConnectWithMeAdminResponse(
                entity.getId(),
                entity.getSummary(),
                entity.getLinkedin_url(),
                entity.getGithub_url(),
                entity.getEmail(),
                entity.getPortfolio_url()
        );
    }
}

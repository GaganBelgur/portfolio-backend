package com.gaganbelgur.portfolio.serviceimpl;

import com.gaganbelgur.portfolio.dto.request.StatsRequest;
import com.gaganbelgur.portfolio.dto.response.admins.StatsAdminResponse;
import com.gaganbelgur.portfolio.dto.response.publics.StatsResponse;
import com.gaganbelgur.portfolio.entity.StatsEntity;
import com.gaganbelgur.portfolio.repository.StatsRepository;
import com.gaganbelgur.portfolio.service.StatsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatsServiceImpl implements StatsService {

    private final StatsRepository repository;

    public StatsServiceImpl(StatsRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<StatsResponse> getStats() {
        return repository.findAll().stream().map(this::map).toList();
    }

    @Override
    public List<StatsAdminResponse> getStatsForAdmin() {
        return repository.findAll().stream().map(this::mapAdmin).toList();
    }

    @Override
    public StatsAdminResponse createStat(StatsRequest request) {
        StatsEntity entity = new StatsEntity();
        updateEntityFromRequest(entity, request);
        repository.save(entity);
        return mapAdmin(entity);
    }

    @Override
    public StatsAdminResponse updateStat(Long id, StatsRequest request) {
        StatsEntity entity = repository.findById(id).orElseThrow();
        updateEntityFromRequest(entity, request);
        repository.save(entity);
        return mapAdmin(entity);
    }

    @Override
    public void deleteStat(Long id) {
        repository.deleteById(id);
    }

    private StatsResponse map(StatsEntity entity) {
        return new StatsResponse(
                entity.getName(),
                entity.getTitle(),
                entity.getCount()
        );
    }

    private void updateEntityFromRequest(StatsEntity entity, StatsRequest request) {
        entity.setName(request.getName());
        entity.setTitle(request.getTitle());
        entity.setCount(request.getCount());
    }

    private StatsAdminResponse mapAdmin(StatsEntity entity) {
        return new StatsAdminResponse(
                entity.getId(),
                entity.getName(),
                entity.getTitle(),
                entity.getCount()
        );
    }
}

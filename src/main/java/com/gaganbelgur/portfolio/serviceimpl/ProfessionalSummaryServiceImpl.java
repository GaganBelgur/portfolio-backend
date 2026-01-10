package com.gaganbelgur.portfolio.serviceimpl;

import com.gaganbelgur.portfolio.dto.request.ProfessionalSummaryRequest;
import com.gaganbelgur.portfolio.dto.response.admins.ProfessionalSummaryAdminResponse;
import com.gaganbelgur.portfolio.dto.response.publics.ProfessionalSummaryResponse;
import com.gaganbelgur.portfolio.entity.ProfessionalSummaryEntity;
import com.gaganbelgur.portfolio.repository.ProfessionalSummaryRepository;
import com.gaganbelgur.portfolio.service.ProfessionalSummaryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionalSummaryServiceImpl implements ProfessionalSummaryService {

    private final ProfessionalSummaryRepository repository;

    public ProfessionalSummaryServiceImpl(ProfessionalSummaryRepository repository) {
        this.repository = repository;
    }

    @Override
    public ProfessionalSummaryResponse getProfessionalSummary() {
        List<ProfessionalSummaryEntity> entity = repository.findAll();

        if (entity.isEmpty()) {
            return new ProfessionalSummaryResponse(null);
        }

        int entitySize = entity.size();
        return new ProfessionalSummaryResponse(entity.get(entitySize - 1).getSummary());
    }

    @Override
    public ProfessionalSummaryAdminResponse createProfessionalSummary(ProfessionalSummaryRequest request) {
        ProfessionalSummaryEntity entity = new ProfessionalSummaryEntity();
        entity.setSummary(request.getSummary());
        repository.save(entity);
        return new ProfessionalSummaryAdminResponse(entity.getId(), entity.getSummary());
    }

    @Override
    public ProfessionalSummaryAdminResponse updateProfessionalSummary(Long id, ProfessionalSummaryRequest request) {
        ProfessionalSummaryEntity entity = repository.findById(id).orElseThrow();
        entity.setSummary(request.getSummary());
        repository.save(entity);
        return new ProfessionalSummaryAdminResponse(entity.getId(), entity.getSummary());
    }

    @Override
    public void deleteProfessionalSummary(Long id) {
        repository.deleteById(id);
    }
}

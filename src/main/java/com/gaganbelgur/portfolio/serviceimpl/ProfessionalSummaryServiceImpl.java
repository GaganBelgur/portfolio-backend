package com.gaganbelgur.portfolio.serviceimpl;

import com.gaganbelgur.portfolio.dto.publics.ProfessionalSummaryResponse;
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
            return new ProfessionalSummaryResponse(-1, null);
        }

        int entitySize = entity.size();
        return new ProfessionalSummaryResponse(entity.get(entitySize - 1).getId(), entity.get(entitySize - 1).getSummary());
    }
}

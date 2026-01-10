package com.gaganbelgur.portfolio.serviceimpl;

import com.gaganbelgur.portfolio.dto.publics.ProfessionalSummaryResponse;
import com.gaganbelgur.portfolio.entity.ProfessionalSummaryEntity;
import com.gaganbelgur.portfolio.repository.ProfessionalSummaryRepository;
import com.gaganbelgur.portfolio.service.ProfessionalSummaryService;
import org.springframework.stereotype.Service;

@Service
public class ProfessionalSummaryServiceImpl implements ProfessionalSummaryService {

    private final ProfessionalSummaryRepository repository;

    public ProfessionalSummaryServiceImpl(ProfessionalSummaryRepository repository) {
        this.repository = repository;
    }

    @Override
    public ProfessionalSummaryResponse getProfessionalSummary() {
        ProfessionalSummaryEntity entity = repository.findAll().getLast();
        return new ProfessionalSummaryResponse(entity.getId(), entity.getSummary());
    }
}

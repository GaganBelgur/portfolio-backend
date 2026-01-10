package com.gaganbelgur.portfolio.controller.publics;

import com.gaganbelgur.portfolio.dto.publics.ProfessionalSummaryResponse;
import com.gaganbelgur.portfolio.service.ProfessionalSummaryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/summary")
public class ProfessionalSummaryController {

    private final ProfessionalSummaryService service;

    public ProfessionalSummaryController(ProfessionalSummaryService service) {
        this.service = service;
    }

    @GetMapping
    public ProfessionalSummaryResponse getProfessionalSummary() {
        return service.getProfessionalSummary();
    }

}

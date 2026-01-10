package com.gaganbelgur.portfolio.controller.admins;

import com.gaganbelgur.portfolio.dto.request.ProfessionalSummaryRequest;
import com.gaganbelgur.portfolio.dto.response.admins.ProfessionalSummaryAdminResponse;
import com.gaganbelgur.portfolio.service.ProfessionalSummaryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/professional-summary")
public class ProfessionalSummaryAdminController {
    private final ProfessionalSummaryService service;

    public ProfessionalSummaryAdminController(ProfessionalSummaryService service) {
        this.service = service;
    }

    @PostMapping
    public ProfessionalSummaryAdminResponse createProfessionalSummary(@RequestBody ProfessionalSummaryRequest request) {
        return service.createProfessionalSummary(request);
    }

    @PutMapping("/{id}")
    public ProfessionalSummaryAdminResponse updateProfessionalSummary(@PathVariable Long id, @RequestBody ProfessionalSummaryRequest request) {
        return service.updateProfessionalSummary(id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteProfessionalSummary(@PathVariable Long id) {
        service.deleteProfessionalSummary(id);
    }
}

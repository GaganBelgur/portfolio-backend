package com.gaganbelgur.portfolio.controller.admins;

import com.gaganbelgur.portfolio.dto.request.ResponsibilityRequest;
import com.gaganbelgur.portfolio.dto.response.admins.ResponsibilityAdminResponse;
import com.gaganbelgur.portfolio.dto.response.publics.ResponsibilityResponse;
import com.gaganbelgur.portfolio.service.ResponsibilityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/responsibility")
public class ResponsibilityAdminController {

    private final ResponsibilityService service;

    public ResponsibilityAdminController(ResponsibilityService service) {
        this.service = service;
    }

    @GetMapping
    public List<ResponsibilityAdminResponse> getResponsibilities() {
        return service.getResponsibilitiesForAdmin();
    }

    @PostMapping
    public ResponsibilityAdminResponse createResponsibility(@RequestBody ResponsibilityRequest request) {
        return service.createResponsibility(request);
    }

    @PutMapping("/{id}")
    public ResponsibilityAdminResponse updateResponsibility(@PathVariable Long id, @RequestBody ResponsibilityRequest request) {
        return service.updateResponsibility(id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteResponsibility(@PathVariable Long id) {
        service.deleteResponsibility(id);
    }
}

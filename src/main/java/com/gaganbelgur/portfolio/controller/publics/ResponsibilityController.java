package com.gaganbelgur.portfolio.controller.publics;

import com.gaganbelgur.portfolio.dto.response.publics.ResponsibilityResponse;
import com.gaganbelgur.portfolio.service.ResponsibilityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/responsibility")
public class ResponsibilityController {

    private final ResponsibilityService service;

    public ResponsibilityController(ResponsibilityService service) {
        this.service = service;
    }

    @GetMapping
    public List<ResponsibilityResponse> getResponsibilities() {
        return service.getResponsibilities();
    }
}

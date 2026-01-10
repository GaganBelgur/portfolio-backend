package com.gaganbelgur.portfolio.controller.publics;

import com.gaganbelgur.portfolio.dto.response.publics.AboutMeResponse;
import com.gaganbelgur.portfolio.service.AboutMeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/about-me")
public class AboutMeController {

    private final AboutMeService service;

    public AboutMeController(AboutMeService service) {
        this.service = service;
    }

    @GetMapping
    public AboutMeResponse getAboutMe() {
        return service.getAboutMe();
    }
}

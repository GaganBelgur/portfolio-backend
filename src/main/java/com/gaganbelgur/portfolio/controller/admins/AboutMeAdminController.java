package com.gaganbelgur.portfolio.controller.admins;

import com.gaganbelgur.portfolio.dto.request.AboutMeRequest;
import com.gaganbelgur.portfolio.dto.response.admins.AboutMeAdminResponse;
import com.gaganbelgur.portfolio.service.AboutMeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/about-me")
public class AboutMeAdminController {
    private final AboutMeService service;

    public AboutMeAdminController(AboutMeService service) {
        this.service = service;
    }

    @GetMapping
    public List<AboutMeAdminResponse> getAboutMe() {
        return service.getAboutMeAdmin();
    }

    @PostMapping
    public AboutMeAdminResponse createAboutMe(@RequestBody AboutMeRequest request) {
        return service.createAboutMe(request);
    }

    @PutMapping("/{id}")
    public AboutMeAdminResponse updateAboutMe(@PathVariable Long id, @RequestBody AboutMeRequest request) {
        return service.updateAboutMe(id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteAboutMe(@PathVariable Long id) {
        service.deleteAboutMe(id);
    }
}

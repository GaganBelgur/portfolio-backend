package com.gaganbelgur.portfolio.controller.admins;

import com.gaganbelgur.portfolio.dto.request.StatsRequest;
import com.gaganbelgur.portfolio.dto.response.admins.StatsAdminResponse;
import com.gaganbelgur.portfolio.service.StatsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/stats")
public class StatsAdminController {

    private final StatsService service;

    public StatsAdminController(StatsService service) {
        this.service = service;
    }

    @GetMapping
    public List<StatsAdminResponse> getStats() {
        return service.getStatsForAdmin();
    }

    @PostMapping
    public StatsAdminResponse createStats(@RequestBody StatsRequest request) {
        return service.createStat(request);
    }

    @PutMapping("/{id}")
    public StatsAdminResponse updateStats(@PathVariable Long id, @RequestBody StatsRequest request) {
        return service.updateStat(id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteStats(@PathVariable Long id) {
        service.deleteStat(id);
    }
}

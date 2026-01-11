package com.gaganbelgur.portfolio.controller.admins;

import com.gaganbelgur.portfolio.dto.request.ConnectWithMeRequest;
import com.gaganbelgur.portfolio.dto.response.admins.ConnectWithMeAdminResponse;
import com.gaganbelgur.portfolio.service.ConnectWithMeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/connect-with-me")
public class ConnectWithMeAdminController {

    private final ConnectWithMeService service;

    public ConnectWithMeAdminController(ConnectWithMeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ConnectWithMeAdminResponse> getConnectWithMe() {
        return service.getConnectWithMeAdmin();
    }

    @PostMapping
    public ConnectWithMeAdminResponse createConnectWithMe(@RequestBody ConnectWithMeRequest request) {
        return service.createConnectWithMe(request);
    }

    @PutMapping("/{id}")
    public ConnectWithMeAdminResponse updateConnectWithMe(@PathVariable Long id, @RequestBody ConnectWithMeRequest request) {
        return service.updateConnectWithMe(id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteConnectWithMe(@PathVariable Long id) {
        service.deleteConnectWithMe(id);
    }
}

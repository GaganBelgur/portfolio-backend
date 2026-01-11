package com.gaganbelgur.portfolio.controller.publics;

import com.gaganbelgur.portfolio.dto.response.publics.ConnectWithMeResponse;
import com.gaganbelgur.portfolio.service.ConnectWithMeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/connect-with-me")
public class ConnectWithMeController {

    private final ConnectWithMeService service;

    public ConnectWithMeController(ConnectWithMeService service) {
        this.service = service;
    }

    @GetMapping
    public ConnectWithMeResponse getConnectWithMe() {
        return service.getConnectWithMe();
    }
}

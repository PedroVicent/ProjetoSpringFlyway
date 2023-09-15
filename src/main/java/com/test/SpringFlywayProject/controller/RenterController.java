package com.test.SpringFlywayProject.controller;

import com.test.SpringFlywayProject.entity.Renter;
import com.test.SpringFlywayProject.entity.dto.RenterDTO;
import com.test.SpringFlywayProject.service.RenterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/renter")
public class RenterController {

    private RenterService service;

    public RenterController(RenterService service) {
        this.service = service;
    }

    @PostMapping
    public Renter saveRenter(@RequestBody RenterDTO data) {
        return service.saveRenter(data);
    }

    @GetMapping
    public List<Renter> findAllRenters() {
        return service.findAllRenters();
    }
}

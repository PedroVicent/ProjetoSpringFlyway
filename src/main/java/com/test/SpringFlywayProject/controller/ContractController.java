package com.test.SpringFlywayProject.controller;

import com.test.SpringFlywayProject.entity.Contract;
import com.test.SpringFlywayProject.entity.dto.ContractDTO;
import com.test.SpringFlywayProject.service.ContractService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contract")
public class ContractController {

    private ContractService service;

    public ContractController(ContractService service) {
        this.service = service;
    }

    @PostMapping
    public Contract saveContract(@RequestBody ContractDTO data) {
        return service.saveContract(data);
    }

    @GetMapping("/{id}")
    public Contract findById(@PathVariable Long id){
        return service.findContractById(id);
    }

}

package com.test.SpringFlywayProject.service;

import com.test.SpringFlywayProject.entity.Contract;
import com.test.SpringFlywayProject.entity.dto.ContractDTO;
import com.test.SpringFlywayProject.repository.CarRepository;
import com.test.SpringFlywayProject.repository.ContractRepository;
import com.test.SpringFlywayProject.repository.RenterRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ContractService {

    private ContractRepository repository;

    private RenterRepository renterRepository;

    private CarRepository carRepository;

    public ContractService(ContractRepository repository, RenterRepository renterRepository, CarRepository carRepository) {
        this.repository = repository;
        this.renterRepository = renterRepository;
        this.carRepository = carRepository;
    }

    public Contract saveContract(ContractDTO contractDTO) {
        var car = carRepository.findById(contractDTO.getCarId()).orElseThrow();
        var renter = renterRepository.findById(contractDTO.getRenterId()).orElseThrow();
        car.setAvailable(Boolean.FALSE);
        return this.repository.save(new Contract(car, renter, LocalDate.now().plusDays(7)));
    }

    public Contract findContractById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public List<Contract> findAllContracts() {
        return repository.findAll();
    }

}

package com.test.SpringFlywayProject.service;

import com.test.SpringFlywayProject.entity.Renter;
import com.test.SpringFlywayProject.entity.dto.RenterDTO;
import com.test.SpringFlywayProject.repository.RenterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RenterService {

    private RenterRepository repository;

    public RenterService(RenterRepository repository) {
        this.repository = repository;
    }

    public Renter saveRenter(RenterDTO renterDTO) {
        return repository.save(new Renter(renterDTO));
    }

    public Renter findRenterById(Long id) {
        var renterFound = repository.findById(id).orElseThrow();
        return renterFound;
    }

    public List<Renter> findAllRenters() {
        return repository.findAll();
    }

    public Renter updateRenter(Long id, RenterDTO renterDTO) {
        Renter renter = findRenterById(id);
        renter.setName(renterDTO.name());
        renter.setDocument(renterDTO.document());
        return repository.save(renter);
    }

    public String deleteRenter(Long id) {
        Renter renter = findRenterById(id);
        repository.delete(renter);
        return "Renter " + renter.getName() + "deleted!";
    }


}

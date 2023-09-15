package com.test.SpringFlywayProject.repository;

import com.test.SpringFlywayProject.entity.Renter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RenterRepository extends JpaRepository<Renter, Long> {
}

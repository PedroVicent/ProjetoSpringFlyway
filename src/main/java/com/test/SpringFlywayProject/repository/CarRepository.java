package com.test.SpringFlywayProject.repository;

import com.test.SpringFlywayProject.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}

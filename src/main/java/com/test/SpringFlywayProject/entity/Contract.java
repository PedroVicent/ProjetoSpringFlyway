package com.test.SpringFlywayProject.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Car car;

    private Renter renter;

    private LocalDate expirationDate;

}

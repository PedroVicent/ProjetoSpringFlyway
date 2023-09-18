package com.test.SpringFlywayProject.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "car_id")
    @ManyToOne
    private Car car;

    @JoinColumn(name = "renter_id")
    @ManyToOne
    private Renter renter;

    private LocalDate expirationDate;

}

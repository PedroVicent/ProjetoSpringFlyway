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

    @Column(name = "expiration_date")
    private LocalDate expirationDate;

    public Contract(Car car, Renter renter, LocalDate expirationDate) {
        this.car = car;
        this.renter = renter;
        this.expirationDate = expirationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Renter getRenter() {
        return renter;
    }

    public void setRenter(Renter renter) {
        this.renter = renter;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}

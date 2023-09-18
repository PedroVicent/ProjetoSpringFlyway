package com.test.SpringFlywayProject.entity;

import com.test.SpringFlywayProject.entity.dto.RenterDTO;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Renter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String document;

    public Renter(){}

    public Renter(Long id, String name, String document) {
        this.id = id;
        this.name = name;
        this.document = document;
    }

    public Renter(RenterDTO renter) {
        this.document = renter.document();
        this.name = renter.name();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

}

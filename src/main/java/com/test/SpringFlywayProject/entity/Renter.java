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

    private Long document;


    public Renter(Long id, String name, Long document) {
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

    public Long getDocument() {
        return document;
    }

    public void setDocument(Long document) {
        this.document = document;
    }

}

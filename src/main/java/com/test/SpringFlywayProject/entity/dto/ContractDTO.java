package com.test.SpringFlywayProject.entity.dto;

public class ContractDTO {

    private Long carId;

    private Long renterId;

    public ContractDTO(Long carId, Long renterId) {
        this.carId = carId;
        this.renterId = renterId;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Long getRenterId() {
        return renterId;
    }

    public void setRenterId(Long renterId) {
        this.renterId = renterId;
    }
}

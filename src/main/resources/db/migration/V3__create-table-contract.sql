CREATE TABLE CONTRACT(
    id SERIAL PRIMARY KEY,
    car_id INT NOT NULL,
    renter_id INT NOT NULL,
    expirationDate DATE NOT NULL,
    CONSTRAINT FK_car_id FOREIGN KEY (car_id) REFERENCES CAR (id),
    CONSTRAINT FK_renter_id FOREIGN KEY (renter_id) REFERENCES RENTER (id)
);
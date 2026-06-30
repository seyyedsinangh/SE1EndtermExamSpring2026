package edu.university.s40131055.payment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Payment {
    @Id
    public Long id;
    public Long reservationId;
    public Double amount;
}

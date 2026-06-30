package edu.university.s40131055.reservation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Reservation {
    @Id
    public Long id;
    public Long propertyId;
    public Long userId;
}

package edu.university.s40131055.review.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Review {
    @Id
    public Long id;
    public Long propertyId;
    public Long userId;
    public String comment;
}

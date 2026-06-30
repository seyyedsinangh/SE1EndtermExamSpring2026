package edu.university.s40131055.property.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Property {
    @Id
    public Long id;
    public String title;
    public String description;
}

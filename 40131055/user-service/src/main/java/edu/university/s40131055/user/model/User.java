package edu.university.s40131055.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    public Long id;
    public String name;
    public String email;
}

package edu.university.s40131055.auth.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserCredential {
    @Id
    public Long id;
    public String username;
    public String password;
}

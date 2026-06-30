package edu.university.s40131055.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.university.s40131055.auth.model.UserCredential;

public interface AuthRepository extends JpaRepository<UserCredential, Long> {
}

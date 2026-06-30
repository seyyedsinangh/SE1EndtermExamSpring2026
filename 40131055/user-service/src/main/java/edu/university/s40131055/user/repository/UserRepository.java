package edu.university.s40131055.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.university.s40131055.user.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

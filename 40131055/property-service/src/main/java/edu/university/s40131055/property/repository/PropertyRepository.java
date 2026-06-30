package edu.university.s40131055.property.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.university.s40131055.property.model.Property;

public interface PropertyRepository extends JpaRepository<Property, Long> {
}

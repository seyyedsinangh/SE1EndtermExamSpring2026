package edu.university.s40131055.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.university.s40131055.reservation.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}

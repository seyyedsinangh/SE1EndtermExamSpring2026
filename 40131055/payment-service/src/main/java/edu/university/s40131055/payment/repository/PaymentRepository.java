package edu.university.s40131055.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.university.s40131055.payment.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}

package edu.university.s40131055.review.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.university.s40131055.review.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}

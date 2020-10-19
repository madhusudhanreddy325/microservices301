package com.mindtree.inventoryservcie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.inventoryservcie.entity.Review;





@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

}

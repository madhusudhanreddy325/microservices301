package com.mindtree.bookingservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.bookingservices.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>{

}

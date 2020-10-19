package com.mindtree.inventoryservcie.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mindtree.inventoryservcie.entity.Screen;





@Repository
public interface ScreenRepository extends JpaRepository<Screen, String>{
	@Query(value = "select * from screen where screen_id = :screenId ", nativeQuery = true)
	Optional<Screen> findByName(String screenId);


}

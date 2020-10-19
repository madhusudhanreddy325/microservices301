package com.mindtree.inventoryservcie.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mindtree.inventoryservcie.entity.ShowData;





@Repository
public interface ShowDataRepository extends JpaRepository<ShowData, String>{

	@Query(value = "select * from show_data where show_id = :showId ", nativeQuery = true)
	Optional<ShowData> findByName(String showId);

}

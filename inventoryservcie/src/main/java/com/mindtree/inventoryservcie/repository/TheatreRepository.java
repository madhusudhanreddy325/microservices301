package com.mindtree.inventoryservcie.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.inventoryservcie.entity.Theatre;





@Repository
public interface TheatreRepository extends JpaRepository<Theatre, String>{
//	@Query(value = "select * from theatre where theatre_id = :theatreId ", nativeQuery = true)
//	Optional<Theatre> findByName(String theatreId);


}

package com.mindtree.inventoryservcie.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mindtree.inventoryservcie.entity.Movie;




@Repository
public interface MovieRepository extends JpaRepository<Movie, String> {
	@Query(value = "select * from movie where movie_id = :movieId ", nativeQuery = true)
	Optional<Movie> findByName(String movieId);


}

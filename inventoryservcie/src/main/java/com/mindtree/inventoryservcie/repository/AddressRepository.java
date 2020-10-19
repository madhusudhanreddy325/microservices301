package com.mindtree.inventoryservcie.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mindtree.inventoryservcie.entity.Address;




@Repository
public interface AddressRepository extends JpaRepository<Address, String> {
	@Query(value = "select * from address where address_id = :addressId ", nativeQuery = true)
	Optional<Address> findByName(String addressId);


}

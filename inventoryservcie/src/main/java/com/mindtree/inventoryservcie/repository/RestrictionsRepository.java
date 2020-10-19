package com.mindtree.inventoryservcie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.inventoryservcie.entity.Restrictions;





@Repository
public interface RestrictionsRepository extends JpaRepository<Restrictions, Long>{

}

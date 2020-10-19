package com.mindtree.inventoryservcie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.inventoryservcie.entity.SocialMedia;





@Repository
public interface SocialMediaRepository extends JpaRepository<SocialMedia, Integer>{

}

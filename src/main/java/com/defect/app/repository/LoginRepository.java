package com.defect.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.defect.app.entities.LoginEntities;

public interface LoginRepository extends JpaRepository<LoginEntities, Long>{
	
	LoginEntities findByUserId(long id);

}

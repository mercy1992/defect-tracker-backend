package com.defect.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.defect.app.entities.USERDefectEntities;

public interface USERDefectRepository extends JpaRepository<USERDefectEntities, Long>{

	USERDefectEntities findByDefectId(long id);
}

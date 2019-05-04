package com.defect.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.defect.app.entities.QADefectEntities;

public interface QADefectRepository extends JpaRepository<QADefectEntities, Long>{
	
	QADefectEntities findByDefectId(long id);

}

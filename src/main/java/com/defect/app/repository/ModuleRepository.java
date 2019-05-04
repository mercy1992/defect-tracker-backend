package com.defect.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.defect.app.entities.ModuleEntities;

public interface ModuleRepository extends JpaRepository<ModuleEntities, Long>{
	
	ModuleEntities findByModuleId(long id);

}

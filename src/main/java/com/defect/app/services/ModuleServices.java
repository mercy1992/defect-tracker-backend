package com.defect.app.services;

import java.util.List;

import com.defect.app.entities.ModuleEntities;

public interface ModuleServices {
	
	void saveModule(ModuleEntities moduleentities);
	List<ModuleEntities> getAllModuleEntities();
	ModuleEntities getByModuleId(Long id);
	void deleteModuleById(Long id);
	

}

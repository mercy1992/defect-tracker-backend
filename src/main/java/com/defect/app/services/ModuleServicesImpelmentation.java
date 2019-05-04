package com.defect.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.app.entities.ModuleEntities;
import com.defect.app.repository.ModuleRepository;

@Service
public class ModuleServicesImpelmentation implements ModuleServices {

	@Autowired
	private ModuleRepository moduleRepository;
	
	@Override
	public void saveModule(ModuleEntities moduleEntities) {
		moduleRepository.save(moduleEntities);
		
	}

	@Override
	public List<ModuleEntities> getAllModuleEntities() {
	
		return moduleRepository.findAll();
	}

	@Override
	public ModuleEntities getByModuleId(Long id) {
	
		return moduleRepository.findByModuleId(id);
	}

	@Override
	public void deleteModuleById(Long id) {
		moduleRepository.delete(getByModuleId(id));		
	}
	
}

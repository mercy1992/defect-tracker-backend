package com.defect.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.app.entities.USERDefectEntities;
import com.defect.app.repository.USERDefectRepository;

@Service
public class USERServiceImpelment implements USERDefectService{

	@Autowired 
	private USERDefectRepository userDefectRepository;
	
	@Override
	public Void saveUserDefect(USERDefectEntities user) {
		userDefectRepository.save(user);
		return null;
		
	}

	@Override
	public List<USERDefectEntities> getAllUserDefect() {
		return userDefectRepository.findAll();
	}

	@Override
	public USERDefectEntities getByUserDefectId(Long id) {
		return userDefectRepository.findByDefectId(id);
	}

	@Override
	public void deleteUserDefectId(Long id) {
		userDefectRepository.delete(getByUserDefectId(id));
		
	}


}

package com.defect.app.services;

import java.util.List;

import com.defect.app.entities.USERDefectEntities;

public interface USERDefectService {
	
	Void saveUserDefect(USERDefectEntities user);
	List<USERDefectEntities> getAllUserDefect();
	USERDefectEntities getByUserDefectId(Long id);
	void deleteUserDefectId(Long id);
	

}

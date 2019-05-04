package com.defect.app.services;

import java.util.List;

import com.defect.app.entities.LoginEntities;


public interface LoginServices {
	
	void saveUser(LoginEntities loginEntities);
	List<LoginEntities> getAllUser();
	LoginEntities getByUserId(Long id);
	void deleteUserById(Long id);

}

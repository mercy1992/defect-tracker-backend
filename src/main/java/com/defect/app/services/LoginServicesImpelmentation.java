package com.defect.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.defect.app.entities.LoginEntities;
import com.defect.app.repository.LoginRepository;

public class LoginServicesImpelmentation implements LoginServices {

	@Autowired
	private LoginRepository loginRepository;
	@Override
	public void saveUser(LoginEntities loginEntities) {
		loginRepository.save(loginEntities);
		
	}

	@Override
	public List<LoginEntities> getAllUser() {
		return loginRepository.findAll();
	}

	@Override
	public LoginEntities getByUserId(Long id) {
		return loginRepository.findByUserId(id);
	}

	@Override
	public void deleteUserById(Long id) {
		loginRepository.delete(getByUserId(id));
	}

}

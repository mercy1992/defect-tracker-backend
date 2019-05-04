package com.defect.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.defect.app.entities.LoginEntities;
import com.defect.app.services.LoginServices;

@RestController
public class LoginController {

	
	@Autowired
	private LoginServices userservices;
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/saveUser")
	public  HttpStatus createModule(@Valid @RequestBody LoginEntities userEntities ) {
		userservices.saveUser(userEntities);
		return HttpStatus.CREATED;
	}
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/getUser")
	public List<LoginEntities> getAllUser() {
		return userservices.getAllUser();
	}
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/getUserById/{id}")
	public ResponseEntity<LoginEntities> getByUserId(@PathVariable("id") Long id) {
		return new ResponseEntity<LoginEntities>(userservices.getByUserId(id),HttpStatus.OK);
	}
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/deleteUser/{id}")
	public ResponseEntity<LoginEntities> deleteUserEntities(@PathVariable("id") Long id){
		userservices.deleteUserById(id);
		return new ResponseEntity<LoginEntities> (HttpStatus.NO_CONTENT);
		
	}
	
}

package com.defect.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.defect.app.entities.USERDefectEntities;
import com.defect.app.services.USERDefectService;

@RestController
public class USERDefectController {

	@Autowired
	private USERDefectService userDefectService;
	
	@PostMapping("/saveUserDefect")
	public HttpStatus createModule(@Valid @RequestBody USERDefectEntities userDefect) {
		userDefectService.saveUserDefect(userDefect);
		return HttpStatus.CREATED;
		
	}
	
	@GetMapping("/getAllUserDefect")
	public List<USERDefectEntities> getAllUserDefect(){
		return userDefectService.getAllUserDefect();
	}
	
	@DeleteMapping("/deleteUserDefect")
	public ResponseEntity<USERDefectEntities> deleteUserDefectById(@PathVariable("id") Long id){
		userDefectService.deleteUserDefectId(id);
		return new ResponseEntity<USERDefectEntities>(HttpStatus.NO_CONTENT);
	}
	
//	@PutMapping("/updateProject/{id}")
//	public ResponseEntity<USERDefectEntities>
}

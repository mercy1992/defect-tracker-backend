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

import com.defect.app.entities.ModuleEntities;
import com.defect.app.services.ModuleServices;

@RestController
public class ModuleController {
	
	@Autowired
	private ModuleServices moduleserivices;
	
	@PostMapping("/savemodule")
	public  HttpStatus createModule(@Valid @RequestBody ModuleEntities moduleEntities ) { 
		moduleserivices.saveModule(moduleEntities);
		return HttpStatus.CREATED;
	}
	
	
	@GetMapping("/getAllModule")
	public List<ModuleEntities> getAllModuleEntities(){
		return moduleserivices.getAllModuleEntities();
	}
	
	@GetMapping("/getModuleById/{id}")
	public ResponseEntity<ModuleEntities> getByModuleId(@PathVariable("id") Long id){
		return new ResponseEntity<ModuleEntities> (moduleserivices.getByModuleId(id),HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deleteModule/{id}")
	public ResponseEntity<ModuleEntities> deleteModuleEntities(@PathVariable("id") Long id){
		moduleserivices.deleteModuleById(id);
		return new ResponseEntity<ModuleEntities> (HttpStatus.NO_CONTENT);
	}
	}


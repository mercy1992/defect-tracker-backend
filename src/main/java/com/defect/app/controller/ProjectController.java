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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.defect.app.entities.Project;
import com.defect.app.services.ProjectService;

@RestController
public class ProjectController {
	  
	
	@Autowired
	private ProjectService projectservice;
	
	@CrossOrigin("http://localhost:3000")
	@PostMapping("/saveproject")
	public  HttpStatus createModule(@Valid @RequestBody Project projectEntities ) {
		projectservice.saveProject(projectEntities);
		return HttpStatus.CREATED;
	}
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/getProject")
	public List<Project> getAllProjectEntities(){
		return projectservice.getAllProjectEntities();
		
	}
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/getProjectById/{id}")
	public ResponseEntity<Project> getByProjectId(@PathVariable("id") Long id){
		return new ResponseEntity<Project>(projectservice.getByProjectId(id),HttpStatus.OK);
		
	}
	
	@CrossOrigin("http://localhost:3000")
	@PutMapping("/updateProject/{id}")
	public ResponseEntity<Project> UpdataProject(@Valid @RequestBody Project project) {
		projectservice.updateProject(project);
		return new ResponseEntity<Project> (project, HttpStatus.NO_CONTENT);
		
	}
	
	@CrossOrigin("http://localhost:3000")
	@DeleteMapping("/deleteProject/{id}")
	public ResponseEntity<Project> deleteProjectEntities(@PathVariable("id") Long id){
		projectservice.deleteProjectById(id);
		return new ResponseEntity<Project> (HttpStatus.NO_CONTENT);
		
	}
	 
}

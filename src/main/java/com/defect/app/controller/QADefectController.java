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

import com.defect.app.entities.QADefectEntities;
import com.defect.app.services.QADefectServices;

@RestController
public class QADefectController {
	
	@Autowired
	private QADefectServices defectSerivces;
	
	@CrossOrigin("http://localhost:3000")
	@PostMapping("/savedefect")
	public  HttpStatus createModule(@Valid @RequestBody QADefectEntities defectEntities ) { 
		defectSerivces.saveDefect(defectEntities);
		return HttpStatus.CREATED;
	}
	
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/getAllDefect")
	public List<QADefectEntities> getAllDefectEntities(){
		return defectSerivces.getAllDefectEntities(); 
	
	}
	
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/getByDefectId/{id}")
	public QADefectEntities getByDefectId(@PathVariable("id") Long id){
		QADefectEntities book = defectSerivces.getByDefectId(id);
		return book;
		
//		
//		return QADefectEntities (defectSerivces.getByDefectId(id),HttpStatus.OK); 
	}
	
	@CrossOrigin("http://localhost:3000")
	@PutMapping("/updateQADefect/{id}")
	public ResponseEntity<QADefectEntities> updateDefect(@Valid @RequestBody QADefectEntities defectEntities) {
		defectSerivces.updateQADefect(defectEntities);
		return new ResponseEntity<QADefectEntities> (defectEntities, HttpStatus.NO_CONTENT);
	}
//	@PutMapping("/updateQADefect/{id}")
//	public ResponseEntity<QADefectEntities> updateDefect(@PathVariable @Valid @RequestBody QADefectEntities defectEntities ){
//		defectSerivces.updateQADefect(defectEntities);
//		return new ResponseEntity<QADefectEntities> (defectEntities, HttpStatus.NO_CONTENT);
//		
//	}
	
//	@DeleteMapping("/deleteDefect/{id}")
//	public ResponseEntity<QADefectEntities> deleteDefectById(@PathVariable("id") Long id){
//		defectSerivces.deleteDefectById(id);
//		return new ResponseEntity<QADefectEntities> (HttpStatus.NO_CONTENT); 
//}
	@CrossOrigin("http://localhost:3000")
	@DeleteMapping("/deleteDefect/{id}")
	public ResponseEntity<QADefectEntities> deleteDefectById(@PathVariable("id") Long id) {
		defectSerivces.deleteDefectById(id);
		return new ResponseEntity<QADefectEntities> (HttpStatus.NO_CONTENT);
	}
	}

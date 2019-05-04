package com.defect.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.app.entities.QADefectEntities;
import com.defect.app.repository.QADefectRepository;

@Service
public class QADefectServicesImpelmentation implements QADefectServices {
	
	@Autowired
	private QADefectRepository defectRepository;

	@Override
	public void saveDefect(QADefectEntities defectEntities) {
		defectRepository.save(defectEntities);
		
	}

	@Override
	public List<QADefectEntities> getAllDefectEntities() {
		return defectRepository.findAll();
	}

	@Override
	public QADefectEntities getByDefectId(Long id) {
		return defectRepository.findByDefectId(id);
	}

	@Override
	public void deleteDefectById(Long id) {
		defectRepository.delete(getByDefectId(id));
		
	}

	@Override
	public void updateQADefect(QADefectEntities defectEntities) {
		defectRepository.save(defectEntities);
		
	}

}

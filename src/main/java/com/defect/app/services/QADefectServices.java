package com.defect.app.services;

import java.util.List;

import com.defect.app.entities.QADefectEntities;

public interface QADefectServices {
	
	void saveDefect(QADefectEntities defectEntities);
	List<QADefectEntities> getAllDefectEntities();
	QADefectEntities getByDefectId(Long id);
	void updateQADefect(QADefectEntities defectEntities);
	void deleteDefectById(Long id);

}

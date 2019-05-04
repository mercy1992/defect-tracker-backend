
package com.defect.app.services;

import java.util.List;

import com.defect.app.entities.Project;

public interface ProjectService {
	
	void saveProject(Project projectEntities);
	List<Project> getAllProjectEntities();
	Project  getByProjectId(Long id);
	void updateProject(Project project);
	void deleteProjectById(Long id);

}

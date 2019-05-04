package com.defect.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.app.entities.Project;
import com.defect.app.repository.ProjectRepository;

@Service
public class ProjectServiceImpelmentation implements ProjectService{

	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public void saveProject(Project projectEntities) {
		projectRepository.save(projectEntities);
		
	}

	@Override
	public List<Project> getAllProjectEntities() {
	
		return projectRepository.findAll();
	}

	@Override
	public Project getByProjectId(Long id) {
		
		return projectRepository.findByProjectId(id);
	}

	@Override
	public void deleteProjectById(Long id) {
		
		projectRepository.delete(getByProjectId(id));
		
	}

	@Override
	public void updateProject(Project project) {
		projectRepository.save(project);
		
	}
	}



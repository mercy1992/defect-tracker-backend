package com.defect.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.defect.app.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
	
	Project findByProjectId(long id);

}

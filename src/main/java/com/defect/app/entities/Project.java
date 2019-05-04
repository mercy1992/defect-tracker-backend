package com.defect.app.entities;



import javax.persistence.*;

import org.springframework.lang.NonNull;

@Entity
@Table(schema="defect",name="project")
public class Project {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private long projectId;
	@NonNull
private String projectName;

//
////creating relationship with module
//@OneToMany(mappedBy="projectEntities", cascade=CascadeType.ALL)
//private List<ModuleEntities> moduleEntities;
//
//public List<ModuleEntities> getModuleEntities() {
//	return moduleEntities;
//}
//public void setModuleEntities(List<ModuleEntities> moduleEntities) {
//	this.moduleEntities = moduleEntities;
//}




//Getter and Setter
public long getProjectId() {
	return projectId;
}
public void setProjectId(long projectId) {
	this.projectId = projectId;
}
public String getProjectName() {
	return projectName;
}
public void setProjectName(String projectName) {
	this.projectName = projectName;
}
@Override
public String toString() {
	return "ProjectEntities [projectId="+ projectId +",projectName="+ projectName +"]";
}
}

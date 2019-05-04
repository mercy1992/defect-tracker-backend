package com.defect.app.entities;




import javax.persistence.*;


@Entity
@Table(schema="defect",name="module_entities")
public class ModuleEntities  {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private long moduleId;
	private String moduleName;
	
//	//creating relationship class with project
//	@ManyToOne
//	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//	@JoinColumn(name="ProjectEntities",nullable=false)
//	private ProjectEntities projectEntities;
//	
//	public ProjectEntities getProjectEntities() {
//		return projectEntities;
//	}
//	public void setProjectEntities(ProjectEntities projectEntities) {
//		this.projectEntities = projectEntities;
//	}
//	
//	//creating relationship class with UserEntities
//	@OneToMany(mappedBy="userId", cascade=CascadeType.ALL)
//	private List<UserEntities> userEntities;
//	
//	public List<UserEntities> getUserEntities() {
//		return userEntities;
//	}
//	public void setUserEntities(List<UserEntities> userEntities) {
//		this.userEntities = userEntities;
//	}
//
//	//creating relationship with Defect 
//	@OneToMany(mappedBy="defectId", cascade=CascadeType.ALL)
//	private List<DefectEntities> defectEntities;
//	
//	public List<DefectEntities> getDefectEntities() {
//		return defectEntities;
//	}
//	public void setDefectEntities(List<DefectEntities> defectEntities) {
//		this.defectEntities = defectEntities;
//	}
//	
	
	//Getter and Setter
	public long getModuleId() {
		return moduleId;
	}
	public void setModuleId(long moduleId) {
		this.moduleId = moduleId;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	

}

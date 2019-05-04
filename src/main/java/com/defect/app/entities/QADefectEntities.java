package com.defect.app.entities;

import javax.persistence.*;

import org.springframework.lang.NonNull;

@Entity
@Table(schema="defect",name="defect")
public class QADefectEntities {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	
	private long defectId;
	@NonNull
	private String module;
	private String description;
	private String stepsToRecreate;
	private String serverity;
	private String priority;
	private String defectType;
	private String enteredBy;
	private String enteredDate;
	private String status;
	private String assignedTo;
	private String fixedBy;
	private String fixedData;
	private String availableIn;
	private String comments;
	
	//creating Defect with Module
//	@ManyToOne(cascade=CascadeType.ALL)
//	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//	@JoinColumn(name="moduleId",nullable=false)
//	private ModuleEntities moduleEntities;
//	
//	
//	public ModuleEntities getModuleEntities() {
//		return moduleEntities;
//	}
//	public void setModuleEntities(ModuleEntities moduleEntities) {
//		this.moduleEntities = moduleEntities;
//	}
	
	
	//Getter and Setter
	public long getDefectId() {
		return defectId;
	}
	public void setDefectId(long defectId) {
		this.defectId = defectId;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStepsToRecreate() {
		return stepsToRecreate;
	}
	public void setStepsToRecreate(String stepsToRecreate) {
		this.stepsToRecreate = stepsToRecreate;
	}
	public String getServerity() {
		return serverity;
	}
	public void setServerity(String serverity) {
		this.serverity = serverity;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getDefectType() {
		return defectType;
	}
	public void setDefectType(String defectType) {
		this.defectType = defectType;
	}
	public String getEnteredBy() {
		return enteredBy;
	}
	public void setEnteredBy(String enteredBy) {
		this.enteredBy = enteredBy;
	}
	public String getEnteredDate() {
		return enteredDate;
	}
	public void setEnteredDate(String enteredDate) {
		this.enteredDate = enteredDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	public String getFixedBy() {
		return fixedBy;
	}
	public void setFixedBy(String fixedBy) {
		this.fixedBy = fixedBy;
	}
	public String getFixedData() {
		return fixedData;
	}
	public void setFixedData(String fixedData) {
		this.fixedData = fixedData;
	}
	public String getAvailableIn() {
		return availableIn;
	}
	public void setAvailableIn(String availableIn) {
		this.availableIn = availableIn;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}


}

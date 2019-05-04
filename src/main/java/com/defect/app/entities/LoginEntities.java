package com.defect.app.entities;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
@Table(schema="defect",name="Login")
public class LoginEntities  {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	
   
	private long userId;
	private String userName;
	private String[] role;
	private @JsonIgnore String password;
	
//	//creating relationship with Module
//	@ManyToOne(cascade=CascadeType.ALL)
//	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//	@JoinColumn(name="moduleId",nullable=false)
//	private ModuleEntities moduleEntities;
//	
//	public ModuleEntities getModuleEntities() {
//		return moduleEntities;
//	}
//	public void setModuleEntities(ModuleEntities moduleEntities) {
//		this.moduleEntities = moduleEntities;
//	}
//	
	
	//Getter and Setter
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String[] getRole() {
		return role;
	}
	public void setRole(String[] role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	}
	

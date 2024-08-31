package com.galland.kanban_pm_tool.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@NotBlank(message = "Project name is required")
	private String projectName;
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date startDate;
	private Date endDate;
	@NotBlank(message = "Project identifier is required")
	@Size(min=4, max=5, message="Please use 4 or 5 characters for Identifier")
	private String projectIdentifier;
	private String description;
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date createdAt;
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date updatedAt;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Long getProjectId() {
		return Id;
	}

	public void setProjectId(Long projectId) {
		this.Id = projectId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getProjectIdentifier() {
		return projectIdentifier;
	}

	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}

	public Date getCreatedAt() {
		return createdAt;
	}
	//Generic setter cretedAt
	public Date setCreatedAt(Date createdAt) {
		return this.createdAt = createdAt;
	}
	//Sets the createdAt date
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}
	//Sets the updated date when the object is updated
	@PreUpdate
	public void onUpdate() {
		this.updatedAt = new Date();
	}
	//Generic setter updatedAt
	public Date setUpdatedAt(Date updatedAt) {
		return this.updatedAt = updatedAt;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	public void setId(Long id) {
		this.Id = id;
	}
	public Long getId() {
		return Id;
	}

	
}

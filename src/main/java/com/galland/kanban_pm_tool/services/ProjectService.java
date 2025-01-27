package com.galland.kanban_pm_tool.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.galland.kanban_pm_tool.domain.Project;
import com.galland.kanban_pm_tool.repositories.ProjectRepository;

@Service
public class ProjectService {
	@Autowired
	private ProjectRepository projectRepository;
	
	public Project saveOrUpdateProject(Project project) 
	{
		return projectRepository.save(project);
	}

}

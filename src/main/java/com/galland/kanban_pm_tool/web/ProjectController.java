package com.galland.kanban_pm_tool.web;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galland.kanban_pm_tool.domain.Project;
import com.galland.kanban_pm_tool.services.ProjectService;

@RestController
@RequestMapping("/api/project")
public class ProjectController {
	@Autowired
	private ProjectService projectService;
	
	@PostMapping("")
	public ResponseEntity<Project> createNewProject(@RequestBody Project project){
		Project myProject = projectService.saveOrUpdateProject(project);
		return new ResponseEntity<Project>(myProject, HttpStatus.CREATED);
	}

}

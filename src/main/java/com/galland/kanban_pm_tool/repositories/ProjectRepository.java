package com.galland.kanban_pm_tool.repositories;
// import java.util.ArrayList;
// import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.galland.kanban_pm_tool.domain.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, String>{
	//find a project by its identifier
	Project findByProjectIdentifier(String projectId);

	// //find all projects using iterable
	// @Override
	// Iterable<Project> findAll();
	

}

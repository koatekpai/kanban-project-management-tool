package com.galland.kanban_pm_tool.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.galland.kanban_pm_tool.domain.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, String>{
	
	@Override
	default Iterable<Project> findAllById(Iterable<String> ids){
		//TODO :Make sure there is a proper check
		return null;
	}

}

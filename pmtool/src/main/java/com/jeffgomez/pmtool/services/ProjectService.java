package com.jeffgomez.pmtool.services;

import com.jeffgomez.pmtool.domain.Project;
import com.jeffgomez.pmtool.repositories.ProjectRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepositories projectRepositories;

    public Project saveOrUpdateProject(Project project){
        //logic

        return projectRepositories.save(project);
    }
}

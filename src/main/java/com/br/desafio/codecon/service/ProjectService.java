package com.br.desafio.codecon.service;

import com.br.desafio.codecon.entity.Project;
import com.br.desafio.codecon.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    private ProjectRepository projectRepository;

    public void projectService(com.br.desafio.codecon.repository.ProjectRepository projectRepository){
        this.projectRepository = projectRepository;
    }

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

}

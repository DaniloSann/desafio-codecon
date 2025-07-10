package com.br.desafio.codecon.repository;


import com.br.desafio.codecon.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
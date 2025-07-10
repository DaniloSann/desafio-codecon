package com.br.desafio.codecon.repository;


import com.br.desafio.codecon.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {

}
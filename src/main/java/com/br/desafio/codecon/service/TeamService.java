package com.br.desafio.codecon.service;

import com.br.desafio.codecon.entity.Team;
import com.br.desafio.codecon.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    private TeamRepository teamRepository;

    public void TeamService(com.br.desafio.codecon.repository.TeamRepository teamRepository){
        this.teamRepository = teamRepository;
    }

    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    public Team createTeam(Team team) {
        return teamRepository.save(team);
    }

}

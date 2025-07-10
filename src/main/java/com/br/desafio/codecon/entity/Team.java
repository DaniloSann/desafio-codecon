package com.br.desafio.codecon.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
@Table(name = "tb_team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private boolean leader;

    //orphanRemoval = true para remover o elemento do banco de dados
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Project> projects;


}

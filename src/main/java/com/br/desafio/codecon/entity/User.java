package com.br.desafio.codecon.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter @Setter
@Entity
@Table(name = "tb_users")
public class User {
    @Id
    private UUID id;

    private String name;
    private int age;
    private int score;
    private boolean active;
    private String country;

    //cascade para facilitar o salvamento em cascata
    @OneToOne(cascade = CascadeType.ALL)
    private Team team;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Logs> logs;
}

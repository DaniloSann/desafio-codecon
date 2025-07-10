package com.br.desafio.codecon.repository;

import com.br.desafio.codecon.entity.Logs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogsRepository extends JpaRepository<Logs, Long> {

}
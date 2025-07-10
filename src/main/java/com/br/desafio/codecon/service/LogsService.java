package com.br.desafio.codecon.service;

import com.br.desafio.codecon.entity.Logs;
import com.br.desafio.codecon.repository.LogsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogsService {

    private LogsRepository logsRepository;

    public LogsService(com.br.desafio.codecon.repository.LogsRepository logsRepository){
        this.logsRepository = logsRepository;
    }

    public List<Logs> getAllLogs() {
        return logsRepository.findAll();
    }

    public Logs createLog(Logs log) {
        return logsRepository.save(log);
    }


}

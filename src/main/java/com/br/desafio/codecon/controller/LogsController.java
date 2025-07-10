package com.br.desafio.codecon.controller;

import com.br.desafio.codecon.entity.Logs;
import com.br.desafio.codecon.service.LogsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/logs")
public class LogsController {

    private LogsService logsService;

    public LogsController(LogsService logsService){
        this.logsService = logsService;
    }

    @GetMapping
    public List<Logs> getAllLogs() {
        return logsService.getAllLogs();
    }

    @PostMapping
    public Logs createLog(@RequestBody Logs logs) {
        return logsService.createLog(logs);
    }

}

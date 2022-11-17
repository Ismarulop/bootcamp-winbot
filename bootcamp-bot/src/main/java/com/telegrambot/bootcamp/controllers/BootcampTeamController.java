package com.telegrambot.bootcamp.controllers;

import com.telegrambot.bootcamp.dto.BootcampTeam;
import com.telegrambot.bootcamp.services.BootcampTeamService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class BootcampTeamController {
    private BootcampTeamService service;

    @GetMapping("/all")
    public List<BootcampTeam> retrieveAll() {
        return service.getAll();
    }

    //@GetMapping("/winner")
    //public BootcampTeam retrieveWinner() {
        //return service.getWinner();
    //}

    @GetMapping("/{id}")
    public BootcampTeam retrieveTeamById(@PathVariable int id) {
        BootcampTeam bootcampTeam = service.getById(id);
        return bootcampTeam;
    }


}

package com.telegrambot.bootcamp.services;

import com.telegrambot.bootcamp.dto.BootcampTeam;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class BootcampTeamService {
    private static List<BootcampTeam> bootcampTeams = new ArrayList<>();

    public List<BootcampTeam> getAll() {
        return bootcampTeams;
    }

    //public BootcampTeam getWinner() {}

    public BootcampTeam getById(int id) {
        Predicate<? super BootcampTeam> predicate = bootcampTeam -> bootcampTeam.getId().equals(id);
        return bootcampTeams.stream().filter(predicate).findFirst().orElse(null);
    }
}

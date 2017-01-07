package by.dreamteam.sportfirst.controller;


import by.dreamteam.sportfirst.entity.TournamentEntity;
import by.dreamteam.sportfirst.service.LigaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class LigaController {

    @Autowired
    public LigaService ligaService;

    @RequestMapping("/top5")
    public List<TournamentEntity> top5(@RequestParam(value = "name", required = false, defaultValue = "APL") String name) {
        List<TournamentEntity> ligas = new ArrayList<>();
        ligas = ligaService.getAll();
        return ligas;
    }

}

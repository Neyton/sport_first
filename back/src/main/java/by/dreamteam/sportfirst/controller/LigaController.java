package by.dreamteam.sportfirst.controller;


import by.dreamteam.sportfirst.entity.Liga;
import by.dreamteam.sportfirst.service.LigaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class LigaController {

    @Autowired
    public LigaService ligaService;

    @RequestMapping("/top5")
    public List<Liga> top5() {
        List<Liga> ligas = new ArrayList<>();
        ligas = ligaService.getAll();
        return ligas;
    }

}

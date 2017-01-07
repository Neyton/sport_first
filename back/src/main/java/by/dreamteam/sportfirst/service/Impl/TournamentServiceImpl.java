package by.dreamteam.sportfirst.service.Impl;


import by.dreamteam.sportfirst.entity.TournamentEntity;
import by.dreamteam.sportfirst.repository.TournamentRepository;
import by.dreamteam.sportfirst.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TournamentServiceImpl implements TournamentService {

    @Autowired
    TournamentRepository tournamentRepository;


    @Override
    public TournamentEntity getByName(String name) {
        return tournamentRepository.findByName(name);
    }
}

package by.dreamteam.sportfirst.service.Impl;

import by.dreamteam.sportfirst.entity.TournamentEntity;
import by.dreamteam.sportfirst.repository.LigaRepository;
import by.dreamteam.sportfirst.service.LigaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LigaServiceImpl implements LigaService {

    @Autowired
    LigaRepository ligaRepository;

    @Override
    public List<TournamentEntity> getAll() {
        return ligaRepository.findAll();
    }
}

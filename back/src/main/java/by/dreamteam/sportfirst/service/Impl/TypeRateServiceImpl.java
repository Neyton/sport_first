package by.dreamteam.sportfirst.service.Impl;

import by.dreamteam.sportfirst.entity.TypeRateEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import by.dreamteam.sportfirst.repository.TypeRateRepository;
import by.dreamteam.sportfirst.service.TypeRateService;

@Service
@Transactional
public class TypeRateServiceImpl implements TypeRateService{

    @Autowired
    TypeRateRepository typeRateRepository;

    @Override
    public void addType(TypeRateEntity typeRate) {
        typeRateRepository.saveAndFlush(typeRate);
    }

    @Override
    public void deleteType(TypeRateEntity typeRate) {
        typeRateRepository.delete(typeRate);
    }

    @Override
    public TypeRateEntity getTypeById(int id) {
        return typeRateRepository.findOne(id);
    }

    @Override
    public TypeRateEntity editType(TypeRateEntity typeRate) {
        return typeRateRepository.saveAndFlush(typeRate);
    }
}

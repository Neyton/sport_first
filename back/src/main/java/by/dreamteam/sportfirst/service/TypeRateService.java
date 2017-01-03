package by.dreamteam.sportfirst.service;


import by.dreamteam.sportfirst.entity.TypeRateEntity;

public interface TypeRateService {

    void addType(TypeRateEntity typeRate);
    void deleteType(TypeRateEntity typeRate);
    TypeRateEntity getTypeById(int id);
    TypeRateEntity editType(TypeRateEntity typeRate);
}

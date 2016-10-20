package project.service;


import project.entity.TypeRateEntity;

public interface TypeRateService {

    void addType(TypeRateEntity typeRate);
    void deleteType(TypeRateEntity typeRate);
    TypeRateEntity getTypeById(int id);
    TypeRateEntity editType(TypeRateEntity typeRate);
}

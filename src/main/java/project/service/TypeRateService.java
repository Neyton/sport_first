package project.service;


import project.entity.TypeRate;

public interface TypeRateService {

    void addType(TypeRate typeRate);
    void deleteType(TypeRate typeRate);
    TypeRate getTypeById(int id);
    TypeRate editType(TypeRate typeRate);
}

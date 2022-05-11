package com.prueba.elkin.zemsania.repository;

import com.prueba.elkin.zemsania.model.Traveler;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TravelerRepository {

    List<Traveler> searchtBydocument(Integer typeDocument, String document);
}

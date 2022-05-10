package com.prueba.elkin.zemsania.service;

import com.prueba.elkin.zemsania.dto.TravelerCreateDTO;
import com.prueba.elkin.zemsania.dto.TravelerDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TravelerService {

    void save(TravelerCreateDTO TravelerDTO);

    Page<TravelerDTO> searchTraveler(String query, Pageable pageable);

    Optional<TravelerDTO> findOne(Long id);

    TravelerDTO update(TravelerCreateDTO TravelerDTO, Long id);

    List<TravelerDTO> findBydocument(Integer typeDocument, String document);

    void delete (Long id);
}

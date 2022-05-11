package com.prueba.elkin.zemsania.service.impl;

import com.prueba.elkin.zemsania.commons.exceptions.GenericConflictException;
import com.prueba.elkin.zemsania.dto.TravelerCreateDTO;
import com.prueba.elkin.zemsania.dto.TravelerDTO;
import com.prueba.elkin.zemsania.mapper.TravelerMapper;
import com.prueba.elkin.zemsania.model.Traveler;
import com.prueba.elkin.zemsania.repository.TravelerRepository;
import com.prueba.elkin.zemsania.service.TravelerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static com.prueba.elkin.zemsania.exceptions.TravelerError.ELEMENT_NOT_FOUND;

@Slf4j
@Service
@RequiredArgsConstructor
public class TravelerServiceImpl  implements TravelerService {

    private final TravelerRepository repository;
    private final TravelerMapper mapper;


    @Override
    public void save(TravelerCreateDTO TravelerDTO) {

    }

    @Override
    public Page<TravelerDTO> searchTraveler(String query, Pageable pageable) {
        return null;
    }

    @Override
    public Optional<TravelerDTO> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public TravelerDTO update(TravelerCreateDTO TravelerDTO, Long id) {
        return null;
    }

    @Override
    public List<TravelerDTO> findBydocument(Integer typeDocument, String document) {
            log.debug("Request to find Traveler item by Traveler typeDocument and document");
            if(typeDocument > 0 && document.isEmpty()){
                throw new GenericConflictException(ELEMENT_NOT_FOUND);
            }
            return mapper.toDto(repository.searchtBydocument(typeDocument, document));
    }

    @Override
    public void delete(Long id) {

    }
}

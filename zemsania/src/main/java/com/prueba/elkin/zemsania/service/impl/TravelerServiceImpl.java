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
import java.util.stream.Collectors;


import static com.prueba.elkin.zemsania.exceptions.TravelerError.ELEMENT_NOT_FOUND;

@Slf4j
@Service
@RequiredArgsConstructor
public class TravelerServiceImpl  implements TravelerService {

    private final TravelerRepository repository;
    private final TravelerMapper mapper;

    @Override
    @Transactional
    public void save(TravelerCreateDTO TravelerDTO) {
        log.debug("Request to save Traveler : {}", TravelerDTO);
        repository.save(mapper.toEntity(TravelerDTO));
    }

    @Override
    @Transactional(readOnly = true)
    public Page<TravelerDTO> searchTraveler(String query, Pageable pageable) {
        log.debug("Request to search Traveler");
        return repository.search(query, pageable).map(mapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<TravelerDTO> findOne(Long id) {
        log.debug("Request to get Traveler : {}", id);
        return repository.findById(id).map(mapper::toDto);
    }

    @Override
    @Transactional
    public TravelerDTO update(TravelerCreateDTO TravelerDTO, Long id) {
        if(!repository.findById(id).isPresent()){
            throw new GenericConflictException(ELEMENT_NOT_FOUND);
        }
        log.debug("Request to Update Traveler : {}",TravelerDTO);
        Traveler traveler = mapper.toEntity(TravelerDTO);
        traveler.setId(id);
        return mapper.toDto(repository.save(traveler));
    }

    @Override
    public List<TravelerDTO> findBydocument(Integer typeDocument, String document) {
            log.debug("Request to find Traveler item by Traveler typeDocument and document");
            if(typeDocument > 0 && document.isEmpty()){
                throw new GenericConflictException(ELEMENT_NOT_FOUND);
            }
            return mapper.toDto(repository.searchtBydocument(typeDocument, document));
                    //searchtBydocument(typeDocument, document).
                    //stream().map(i -> mapper.toDto(i)).collect(Collectors.toList());
    }


    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}

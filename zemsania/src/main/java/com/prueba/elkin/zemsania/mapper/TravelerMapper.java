package com.prueba.elkin.zemsania.mapper;

import com.prueba.elkin.zemsania.commons.model.EntityMapper;
import com.prueba.elkin.zemsania.dto.TravelerCreateDTO;
import com.prueba.elkin.zemsania.dto.TravelerDTO;
import com.prueba.elkin.zemsania.model.Traveler;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;

@Mapper(componentModel = "spring")
//@Qualifier
public interface TravelerMapper  extends EntityMapper<TravelerDTO, Traveler> {

     Traveler toEntity(TravelerCreateDTO traveler);

     TravelerCreateDTO toDTO(TravelerDTO traveler);
}

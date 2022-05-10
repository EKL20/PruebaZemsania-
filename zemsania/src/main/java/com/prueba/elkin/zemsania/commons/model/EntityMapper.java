package com.prueba.elkin.zemsania.commons.model;

import com.prueba.elkin.zemsania.dto.TravelerDTO;
import org.springframework.beans.factory.annotation.Qualifier;


import java.util.List;

/**
 * @param <D> - DTO type parameter.
 * @param <E> - Entity type parameter.
 */

public interface EntityMapper<D, E>  {

    E toEntity(D dto);

    D toDto(E entity);

    List<E> toEntity(List<D> dtoList);

    List<D> toDto(List<E> entityList);
}

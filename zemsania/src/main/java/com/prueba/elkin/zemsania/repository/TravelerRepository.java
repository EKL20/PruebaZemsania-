package com.prueba.elkin.zemsania.repository;

import com.prueba.elkin.zemsania.model.Traveler;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TravelerRepository extends JpaRepository<Traveler, Long> {

    @Query("SELECT t FROM Traveler t WHERE LOWER(t.firsName) LIKE LOWER(concat('%', :query, '%'))")
    Page<Traveler> search(@Param("query") String query, Pageable pageable);

    @Query("SELECT t FROM Traveler t WHERE t.typeDocument = :typeDocument and t.document = :document")
    List<Traveler> searchtBydocument(Integer typeDocument, String document);
}

package com.prueba.elkin.zemsania.controller;


import com.prueba.elkin.zemsania.dto.TravelerDTO;
import com.prueba.elkin.zemsania.service.TravelerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/traveler")
@RequiredArgsConstructor
public class TravelerController {

    private final TravelerService service;

    @GetMapping("/{typeDocument}/{document}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity <List<TravelerDTO>> findByTravelerDocument(@PathVariable Integer typeDocument, @PathVariable String document){
        log.info("REST request to find items by Traveler typeDocument {} and document {}",typeDocument,document);
        return ResponseEntity.ok().body(service.findBydocument(typeDocument, document));
    }
}

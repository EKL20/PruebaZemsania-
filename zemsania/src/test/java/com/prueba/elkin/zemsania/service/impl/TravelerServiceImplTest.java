package com.prueba.elkin.zemsania.service.impl;

import com.prueba.elkin.zemsania.dto.TravelerCreateDTO;
import com.prueba.elkin.zemsania.dto.TravelerDTO;
import com.prueba.elkin.zemsania.model.Traveler;
import com.prueba.elkin.zemsania.repository.TravelerRepository;
import com.prueba.elkin.zemsania.service.TravelerService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class TravelerServiceImplTest {

    private Object TravelerDTO;

    @Test
    void findBydocument() {
        TravelerRepository repository = mock(TravelerRepository.class);
        TravelerService service = new TravelerService() {
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
                return null;
            }

            @Override
            public void delete(Long id) {

            }
        };
        Traveler travel = new Traveler();
        travel.setFirsName("Maricio");
        travel.setMiddleName("Andres");
        travel.setFirsLastName("Londoño");
        travel.setLastName("Diaz");
        travel.setTypeDocument(1);
        travel.setDocument("23445322");
        travel.setAddress("niquia");
        travel.setNumberPhone("3005300000");
        travel.setCity("Bello");

        List<Traveler> datos = Arrays.asList(new Traveler(false, "Maricio",
                "Andres", "Londoño", "Diaz", 1, "23445322",
                "3005300000", "niquia", "Bello"));
        String s = "23445322";
        Integer t = 1;
        when(repository.searchtBydocument(t, s)).thenReturn(datos);

        assertNotNull(datos);
        assertEquals(1, travel.getTypeDocument());
        assertEquals("23445322", travel.getDocument());
    }
}
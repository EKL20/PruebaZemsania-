package com.prueba.elkin.zemsania.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TravelerDTO {

    private Long id;
    private String firsName;
    private String middleName;
    private String firsLastName;
    private String lastName;
    private Integer typeDocument;
    private String document;
    private String numberPhone;
    private String address;
    private String city;
}

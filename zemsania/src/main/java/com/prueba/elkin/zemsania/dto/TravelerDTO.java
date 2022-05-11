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

    public TravelerDTO(String firsName, String middleName, String firsLastName, String lastName, int typeDocument, String document, String address, String numberPhone, String city) {
        this.firsName = firsName;
        this.middleName = middleName;
        this.firsLastName = firsLastName;
        this.lastName= lastName;
        this.typeDocument= typeDocument;
        this.document= document;
        this.address= address;
        this.numberPhone = numberPhone;
        this.city = city;
    }
}

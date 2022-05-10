package com.prueba.elkin.zemsania.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TravelerCreateDTO implements Serializable {

    private static final long serialVersionUID = -112804910748187939L;

    @NotBlank
    @Size(min = 2, max = 20)
    private String firsName;

    @NotBlank
    @Size(min = 2, max = 20)
    private String middleName;

    @NotBlank
    @Size(min = 2, max = 30)
    private String firsLastName;

    @NotBlank
    @Size(min = 2, max = 30)
    private String lastName;

    @NotNull
    @Min(1) @Max(2)
    private Integer typeDocument;

    @NotBlank
    @Size(min = 2, max = 20)
    private String document;

    @NotBlank
    @Size(min = 7, max = 12)
    private String numberPhone;

    @NotBlank
    @Size(min = 2, max = 50)
    private String address;

    @NotBlank
    @Size(min = 2, max = 20)
    private String city;
}

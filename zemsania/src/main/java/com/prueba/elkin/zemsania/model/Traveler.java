package com.prueba.elkin.zemsania.model;

import com.prueba.elkin.zemsania.commons.model.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.*;

@Entity
@Data
@NoArgsConstructor
@SQLDelete(sql = "UPDATE traveler SET deleted = true WHERE id = ?")
@Where(clause = "deleted = false")
@EqualsAndHashCode(callSuper = true)
@Table(name = "traveler")
public class Traveler extends BaseEntity {

    @NotBlank
    @Size(min= 2, max = 20)
    @Column(name= "firsName", length = 20, nullable = false)
    private String firsName;

    @NotBlank
    @Size(min= 2, max = 20)
    @Column(name= "middleName", length = 20, nullable = false)
    private String middleName;

    @NotBlank
    @Size(min= 2, max = 30)
    @Column(name= "firsLastName", length = 20, nullable = false)
    private String firsLastName;

    @NotBlank
    @Size(min= 2, max = 30)
    @Column(name= "lastName", length = 20, nullable = false)
    private String lastName;

    @NotNull
    @Min(1) @Max(2)
    @Column(name ="typeDocument", nullable = false)
    private Integer typeDocument;

    @NotBlank
    @Size(min= 2, max = 20)
    @Column(name= "document", length = 20, nullable = false)
    private String document;

    @NotBlank
    @Size(min= 7, max = 12)
    @Column(name= "numberPhone", length = 20, nullable = false)
    private String numberPhone;

    @NotBlank
    @Size(min= 2, max = 50)
    @Column(name= "address", length = 20, nullable = false)
    private String address;

    @NotBlank
    @Size(min= 2, max = 20)
    @Column(name= "city", length = 20, nullable = false)
    private String city;

    public Traveler(boolean b, String maricio, String andres, String londoño, String diaz, int i, String s, String s1, String niquia, String bello) {
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

package com.mitocode.tarea.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {
    private Integer idPerson;

    @NotEmpty
    @Size(min = 3, message = "{firstname.size}")
    private String firstName;

    @NotNull
    @Size(min = 3, message = "{lastname.size}")
    private String lastName;


}

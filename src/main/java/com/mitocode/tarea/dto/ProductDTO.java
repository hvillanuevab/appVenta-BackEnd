package com.mitocode.tarea.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private Integer idProduct;

    @NotEmpty
    @Size(min = 3, message = "{name.size}")
    private String name;

    @NotNull
    @Size(min = 3, message = "{brand.size}")
    private String brand;


}

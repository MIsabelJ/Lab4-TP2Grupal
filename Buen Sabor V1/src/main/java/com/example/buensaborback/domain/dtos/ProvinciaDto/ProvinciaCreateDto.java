package com.example.buensaborback.domain.dtos.ProvinciaDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProvinciaCreateDto {

    private String nombre;
    private long idPais;

}

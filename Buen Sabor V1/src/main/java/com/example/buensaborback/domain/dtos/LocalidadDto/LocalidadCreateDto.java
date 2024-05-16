package com.example.buensaborback.domain.dtos.LocalidadDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LocalidadCreateDto {

    private String nombre;
    private long idProvincia;

}

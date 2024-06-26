package com.example.buensaborback.domain.dtos.LocalidadDto;

import com.example.buensaborback.domain.dtos.BaseDto;
import com.example.buensaborback.domain.dtos.ProvinciaDto.ProvinciaDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LocalidadDto extends BaseDto {

    private String nombre;
    private ProvinciaDto provincia;

}

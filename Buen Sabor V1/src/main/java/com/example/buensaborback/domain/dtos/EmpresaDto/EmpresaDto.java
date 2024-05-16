package com.example.buensaborback.domain.dtos.EmpresaDto;

import com.example.buensaborback.domain.dtos.BaseDto;
import com.example.buensaborback.domain.dtos.LocalidadDto.LocalidadDto;
import com.example.buensaborback.domain.entities.Localidad;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmpresaDto extends BaseDto {
    private String calle;
    private Integer numero;
    private Integer cp;

    private LocalidadDto localidad;
}

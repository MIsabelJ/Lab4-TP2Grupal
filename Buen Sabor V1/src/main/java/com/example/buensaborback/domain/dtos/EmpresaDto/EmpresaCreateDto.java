package com.example.buensaborback.domain.dtos.EmpresaDto;

import com.example.buensaborback.domain.dtos.SucursalDto.SucursalCreateDto;
import com.example.buensaborback.domain.entities.Localidad;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmpresaCreateDto {
    private String calle;
    private Integer numero;
    private Integer cp;

    private Set<SucursalCreateDto> sucursales; // Consideracion de borrarlo
}

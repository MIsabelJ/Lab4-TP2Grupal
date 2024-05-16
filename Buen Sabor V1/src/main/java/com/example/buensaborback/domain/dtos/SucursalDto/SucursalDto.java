package com.example.buensaborback.domain.dtos.SucursalDto;

import com.example.buensaborback.domain.dtos.BaseDto;
import com.example.buensaborback.domain.dtos.CategoriaDto.CategoriaDto;
import com.example.buensaborback.domain.dtos.DomicilioDto.DomicilioDto;
import com.example.buensaborback.domain.dtos.EmpresaDto.EmpresaDto;
import com.example.buensaborback.domain.dtos.PromocionDto.PromocionDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SucursalDto extends BaseDto {

    private String nombre;
    @Schema(type = "string", format = "time", pattern = "HH:mm:ss", description = "Horario de apertura en formato HH:mm:ss")
    private LocalTime horarioApertura;
    @Schema(type = "string", format = "time", pattern = "HH:mm:ss", description = "Horario de apertura en formato HH:mm:ss")
    private LocalTime horarioCierre;
    private DomicilioDto domicilio;
    private EmpresaDto empresa;
    private Set<CategoriaDto> categorias;
    private Set<PromocionDto> promociones;

}

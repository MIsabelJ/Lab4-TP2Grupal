package com.example.buensaborback.domain.dtos.SucursalDto;

import com.example.buensaborback.domain.dtos.DomicilioDto.DomicilioCreateDto;
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
public class SucursalCreateDto {

    private String nombre;
    @Schema(type = "string", format = "time", pattern = "HH:mm:ss", description = "Horario de apertura en formato HH:mm:ss")
    private LocalTime horarioApertura;
    @Schema(type = "string", format = "time", pattern = "HH:mm:ss", description = "Horario de apertura en formato HH:mm:ss")
    private LocalTime horarioCierre;
    private DomicilioCreateDto domicilio;
    private Long idEmpresa;
    private Set<Long> idCategorias; // Que onda con esto?
    private Set<Long> idPromociones;

}

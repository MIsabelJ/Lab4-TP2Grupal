package com.example.buensaborback.domain.dtos.SucursalDto;

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
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private Long idDomicilio;
    private Long idEmpresa;
    private Set<Long> idCategorias;
    private Set<Long> idPromociones;

}

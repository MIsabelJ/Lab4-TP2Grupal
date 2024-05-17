package com.example.buensaborback.domain.dtos.PromocionDto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PromocionCreateDto {

    private String denominacion;
    @Schema(type = "string", format = "date", pattern = "dd/MM/yyyy", description = "Fecha de inicio en formato dd/MM/yyyy")
    private LocalDate fechaDesde;
    @Schema(type = "string", format = "date", pattern = "dd/MM/yyyy", description = "Fecha de fin en formato dd/MM/yyyy")
    private LocalDate fechaHasta;
    @Schema(type = "string", format = "time", pattern = "HH:mm:ss", description = "Horario de apertura en formato HH:mm:ss")
    private LocalTime horaDesde;
    @Schema(type = "string", format = "time", pattern = "HH:mm:ss", description = "Horario de cierre en formato HH:mm:ss")
    private LocalTime horaHasta;
    private Double descuento;
    private Long idSucursal;
    private Set<Long> idArticuloManufacturados;
    private Set<Long> idArticulosInsumos;
}

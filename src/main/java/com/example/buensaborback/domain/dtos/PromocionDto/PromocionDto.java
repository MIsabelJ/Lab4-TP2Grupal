package com.example.buensaborback.domain.dtos.PromocionDto;

import com.example.buensaborback.domain.dtos.ArticuloInsumoDto.ArticuloInsumoDto;
import com.example.buensaborback.domain.dtos.ArticuloManufacturadoDto.ArticuloManufacturadoDto;
import com.example.buensaborback.domain.dtos.BaseDto;
import com.example.buensaborback.domain.dtos.SucursalDto.SucursalDto;
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
public class PromocionDto extends BaseDto {

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
    private SucursalDto sucursal;
    private Set<ArticuloManufacturadoDto> articuloManufacturados;
    private Set<ArticuloInsumoDto> articulosInsumos;
}

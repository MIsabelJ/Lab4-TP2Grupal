package com.example.buensaborback.domain.dtos.ArticuloManufacturadoDto;

import com.example.buensaborback.domain.dtos.ArticuloDto.ArticuloDto;
import com.example.buensaborback.domain.dtos.ArticuloInsumoDto.ArticuloInsumoDto;
import com.example.buensaborback.domain.dtos.PromocionDto.PromocionDto;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ArticuloManufacturadoDto extends ArticuloDto {
    private String denominacion;
    private String descripcion;
    private Double precioVenta;
    private Integer tiempoEstimadoMinutos;

    private Set<ArticuloInsumoDto> articulosInsumos; // new HashSet?
    private Set<PromocionDto> estaEnPromociones;

}

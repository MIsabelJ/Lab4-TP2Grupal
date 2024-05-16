package com.example.buensaborback.domain.dtos.ArticuloManufacturadoDto;

import com.example.buensaborback.domain.dtos.ArticuloDto.ArticuloCreateDto;
import com.example.buensaborback.domain.entities.ArticuloInsumo;
import com.example.buensaborback.domain.entities.Promocion;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ArticuloManufacturadoCreateDto extends ArticuloCreateDto {
    private String denominacion;
    private String descripcion;
    private Double precioVenta;
    private Integer tiempoEstimadoMinutos;

    private Set<Long> idArticulosInsumos = new HashSet<>();
    private Set<Long> idEstaEnPromociones;
}

package com.example.buensaborback.domain.dtos.ArticuloInsumoDto;

import com.example.buensaborback.domain.dtos.ArticuloDto.ArticuloCreateDto;
import lombok.*;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ArticuloInsumoCreateDto extends ArticuloCreateDto{
    private String denominacion;
    private Double precioCompra;
    private Double precioVenta;
    private Integer stockActual;
    private Integer stockMaximo;
    private Boolean esParaElaborar;

    private Set<Long> idEstaEnPromociones;

}

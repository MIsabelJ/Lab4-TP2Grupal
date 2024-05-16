package com.example.buensaborback.domain.dtos.ArticuloInsumoDto;

import com.example.buensaborback.domain.dtos.ArticuloDto.ArticuloDto;
import com.example.buensaborback.domain.dtos.ArticuloManufacturadoDto.ArticuloManufacturadoDto;
import com.example.buensaborback.domain.dtos.CategoriaDto.CategoriaDto;
import com.example.buensaborback.domain.dtos.ImagenDto.ImagenDto;
import com.example.buensaborback.domain.dtos.PromocionDto.PromocionDto;
import com.example.buensaborback.domain.dtos.UnidadMedidaDto.UnidadMedidaDto;
import com.example.buensaborback.domain.entities.ArticuloManufacturado;
import com.example.buensaborback.domain.entities.Promocion;
import lombok.*;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ArticuloInsumoDto extends ArticuloDto {
    private String denominacion;
    private Double precioCompra;
    private Double precioVenta;
    private Integer stockActual;
    private Integer stockMaximo;
    private Boolean esParaElaborar;

    private Set<PromocionDto> estaEnPromociones;
    private Set<ArticuloManufacturadoDto> articuloManufacturados;

}

package com.example.buensaborback.domain.dtos.CategoriaDto;

import com.example.buensaborback.domain.dtos.ArticuloInsumoDto.ArticuloInsumoDto;
import com.example.buensaborback.domain.dtos.ArticuloManufacturadoDto.ArticuloManufacturadoDto;
import com.example.buensaborback.domain.dtos.BaseDto;
import com.example.buensaborback.domain.dtos.SucursalDto.SucursalDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CategoriaDto extends BaseDto {

    private String denominacion;
    private CategoriaDto categoriaPadre;
    private Set<CategoriaDto> subcategorias;
    private Set<SucursalDto> sucursales;

}

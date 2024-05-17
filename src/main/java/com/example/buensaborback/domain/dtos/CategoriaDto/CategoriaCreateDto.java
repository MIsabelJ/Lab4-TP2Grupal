package com.example.buensaborback.domain.dtos.CategoriaDto;

import com.example.buensaborback.domain.dtos.ArticuloInsumoDto.ArticuloInsumoDto;
import com.example.buensaborback.domain.dtos.ArticuloManufacturadoDto.ArticuloManufacturadoDto;
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
public class CategoriaCreateDto {
    private String denominacion;
    private Long idCategoriaPadre;
    private Set<Long> idSubcategorias;
    private Set<Long> idSucursales; // Consideracion de borrarlo por bidireccionalidad injustificada
}

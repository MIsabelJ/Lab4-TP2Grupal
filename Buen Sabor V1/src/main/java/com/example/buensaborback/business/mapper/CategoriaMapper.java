package com.example.buensaborback.business.mapper;

import com.example.buensaborback.domain.dtos.CategoriaDto.CategoriaCreateDto;
import com.example.buensaborback.domain.dtos.CategoriaDto.CategoriaDto;
import com.example.buensaborback.domain.entities.Categoria;
import org.mapstruct.Mapping;

//@Mapper(componentModel = "spring", uses = {ArticuloInsumoService.class, ArticuloManufacturadoService.class, CategoriaService.class, SucursalService.class})
public interface CategoriaMapper extends BaseMapper<Categoria, CategoriaDto, CategoriaCreateDto, CategoriaCreateDto> {

    @Mapping(target = "articuloInsumos", source = "idArticuloInsumos", qualifiedByName = "getById")
    @Mapping(target = "articuloManufacturados", source = "idArticuloManufacturados", qualifiedByName = "getById")
    @Mapping(target = "categoriaPadre", source = "idCategoriaPadre", qualifiedByName = "getById")
    @Mapping(target = "subcategorias", source = "idSubcategorias", qualifiedByName = "getById")
    @Mapping(target = "sucursales", source = "idSucursales", qualifiedByName = "getById")
    Categoria toEntityCreate(CategoriaCreateDto source);
}

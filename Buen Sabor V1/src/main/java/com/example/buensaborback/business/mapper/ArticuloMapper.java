package com.example.buensaborback.business.mapper;

import com.example.buensaborback.business.service.CategoriaService;
import com.example.buensaborback.business.service.UnidadMedidaService;
import com.example.buensaborback.domain.dtos.ArticuloDto.ArticuloCreateDto;
import com.example.buensaborback.domain.dtos.ArticuloDto.ArticuloDto;
import com.example.buensaborback.domain.entities.Articulo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
//Indica la direccion en la que va a ir a buscar el metodo con @Named("getById")
@Mapper(componentModel ="spring", uses = {UnidadMedidaService.class, CategoriaService.class})
public interface ArticuloMapper extends BaseMapper<Articulo, ArticuloDto, ArticuloCreateDto, ArticuloCreateDto> {
    //Indicamos a donde ir a buscar los metodos para obtener las entidades a partir del id del DTO Create
    @Mapping(target="unidadMedida", source = "idUnidadMedida", qualifiedByName = "getById")
    @Mapping(target="categoria", source = "idCategoria", qualifiedByName = "getById")
    Articulo toEntityCreate(ArticuloCreateDto source);
}

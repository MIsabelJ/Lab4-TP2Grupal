package com.example.buensaborback.business.facade;

import com.example.buensaborback.business.facade.Base.BaseFacade;
import com.example.buensaborback.domain.dtos.ArticuloManufacturadoDto.ArticuloManufacturadoCreateDto;
import com.example.buensaborback.domain.dtos.ArticuloManufacturadoDto.ArticuloManufacturadoDto;
import com.example.buensaborback.domain.entities.ArticuloManufacturado;

public interface ArticuloManufacturadoFacade extends BaseFacade<ArticuloManufacturadoDto, ArticuloManufacturadoCreateDto, ArticuloManufacturadoCreateDto, Long> {
    ArticuloManufacturadoDto addPromocion(Long idArticuloManufacturado,Long idPromocion);
    ArticuloManufacturadoDto addArticuloInsumo(Long idArticuloManufacturado, Long idArticuloInsumo);
}

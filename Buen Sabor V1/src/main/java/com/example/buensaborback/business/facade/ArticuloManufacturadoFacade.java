package com.example.buensaborback.business.facade;

import com.example.buensaborback.business.facade.Base.BaseFacade;
import com.example.buensaborback.domain.dtos.ArticuloInsumoDto.ArticuloInsumoCreateDto;
import com.example.buensaborback.domain.dtos.ArticuloInsumoDto.ArticuloInsumoDto;
import com.example.buensaborback.domain.dtos.ArticuloManufacturadoDto.ArticuloManufacturadoCreateDto;
import com.example.buensaborback.domain.dtos.ArticuloManufacturadoDto.ArticuloManufacturadoDto;

public interface ArticuloManufacturadoFacade extends BaseFacade<ArticuloManufacturadoDto, ArticuloManufacturadoCreateDto, ArticuloManufacturadoCreateDto, Long> {
}

package com.example.buensaborback.business.facade;

import com.example.buensaborback.business.facade.Base.BaseFacade;
import com.example.buensaborback.domain.dtos.CategoriaDto.CategoriaCreateDto;
import com.example.buensaborback.domain.dtos.CategoriaDto.CategoriaDto;

public interface CategoriaFacade extends BaseFacade<CategoriaDto, CategoriaCreateDto, CategoriaCreateDto, Long> {
    CategoriaDto addSucursal(Long idCategoria, Long idSucursal);
}

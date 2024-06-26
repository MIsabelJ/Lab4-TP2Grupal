package com.example.buensaborback.business.facade;

import com.example.buensaborback.business.facade.Base.BaseFacade;
import com.example.buensaborback.domain.dtos.LocalidadDto.LocalidadCreateDto;
import com.example.buensaborback.domain.dtos.LocalidadDto.LocalidadDto;

public interface LocalidadFacade extends BaseFacade<LocalidadDto, LocalidadCreateDto, LocalidadCreateDto, Long> {
}

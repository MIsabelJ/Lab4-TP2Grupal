package com.example.buensaborback.business.facade;

import com.example.buensaborback.business.facade.Base.BaseFacade;
import com.example.buensaborback.domain.dtos.PromocionDto.PromocionCreateDto;
import com.example.buensaborback.domain.dtos.PromocionDto.PromocionDto;

public interface PromocionFacade extends BaseFacade<PromocionDto, PromocionCreateDto, PromocionCreateDto, Long> {
}

package com.example.buensaborback.business.facade;

import com.example.buensaborback.business.facade.Base.BaseFacade;
import com.example.buensaborback.domain.dtos.DomicilioDto.DomicilioCreateDto;
import com.example.buensaborback.domain.dtos.DomicilioDto.DomicilioDto;

public interface DomicilioFacade extends BaseFacade<DomicilioDto, DomicilioCreateDto, DomicilioCreateDto, Long> {
}

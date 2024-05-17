package com.example.buensaborback.business.facade;

import com.example.buensaborback.business.facade.Base.BaseFacade;
import com.example.buensaborback.domain.dtos.PaisDto.PaisCreateDto;
import com.example.buensaborback.domain.dtos.PaisDto.PaisDto;

public interface PaisFacade extends BaseFacade<PaisDto, PaisCreateDto, PaisCreateDto, Long> {
}

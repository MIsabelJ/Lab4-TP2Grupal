package com.example.buensaborback.business.facade;

import com.example.buensaborback.business.facade.Base.BaseFacade;
import com.example.buensaborback.domain.dtos.SucursalDto.SucursalCreateDto;
import com.example.buensaborback.domain.dtos.SucursalDto.SucursalDto;

public interface SucursalFacade extends BaseFacade<SucursalDto, SucursalCreateDto, SucursalCreateDto, Long> {
}

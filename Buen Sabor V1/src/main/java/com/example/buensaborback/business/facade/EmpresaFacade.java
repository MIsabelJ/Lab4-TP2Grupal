package com.example.buensaborback.business.facade;

import com.example.buensaborback.business.facade.Base.BaseFacade;
import com.example.buensaborback.domain.dtos.EmpresaDto.EmpresaCreateDto;
import com.example.buensaborback.domain.dtos.EmpresaDto.EmpresaDto;

public interface EmpresaFacade extends BaseFacade<EmpresaDto, EmpresaCreateDto, EmpresaCreateDto, Long> {
}

package com.example.buensaborback.business.facade.Imp;

import com.example.buensaborback.business.facade.Base.BaseFacadeImp;
import com.example.buensaborback.business.facade.UnidadMedidaFacade;
import com.example.buensaborback.business.mapper.BaseMapper;
import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.domain.dtos.UnidadMedidaDto.UnidadMedidaCreateDto;
import com.example.buensaborback.domain.dtos.UnidadMedidaDto.UnidadMedidaDto;
import com.example.buensaborback.domain.entities.UnidadMedida;

public class UnidadMedidaFacadeImp extends BaseFacadeImp<UnidadMedida, UnidadMedidaDto, UnidadMedidaCreateDto, UnidadMedidaCreateDto, Long> implements UnidadMedidaFacade {
    public UnidadMedidaFacadeImp(BaseService<UnidadMedida, Long> baseService, BaseMapper<UnidadMedida, UnidadMedidaDto, UnidadMedidaCreateDto, UnidadMedidaCreateDto> baseMapper) {
        super(baseService, baseMapper);
    }
}

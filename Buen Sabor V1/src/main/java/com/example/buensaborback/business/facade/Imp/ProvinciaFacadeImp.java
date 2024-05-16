package com.example.buensaborback.business.facade.Imp;

import com.example.buensaborback.business.facade.Base.BaseFacadeImp;
import com.example.buensaborback.business.facade.ProvinciaFacade;
import com.example.buensaborback.business.mapper.BaseMapper;
import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.domain.dtos.ProvinciaDto.ProvinciaCreateDto;
import com.example.buensaborback.domain.dtos.ProvinciaDto.ProvinciaDto;
import com.example.buensaborback.domain.entities.Provincia;

public class ProvinciaFacadeImp extends BaseFacadeImp<Provincia, ProvinciaDto, ProvinciaCreateDto, ProvinciaCreateDto, Long> implements ProvinciaFacade {
    public ProvinciaFacadeImp(BaseService<Provincia, Long> baseService, BaseMapper<Provincia, ProvinciaDto, ProvinciaCreateDto, ProvinciaCreateDto> baseMapper) {
        super(baseService, baseMapper);
    }
}

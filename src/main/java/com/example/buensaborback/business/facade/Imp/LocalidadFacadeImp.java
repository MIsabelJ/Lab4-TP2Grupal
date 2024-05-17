package com.example.buensaborback.business.facade.Imp;

import com.example.buensaborback.business.facade.Base.BaseFacadeImp;
import com.example.buensaborback.business.facade.LocalidadFacade;
import com.example.buensaborback.business.mapper.BaseMapper;
import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.domain.dtos.LocalidadDto.LocalidadCreateDto;
import com.example.buensaborback.domain.dtos.LocalidadDto.LocalidadDto;
import com.example.buensaborback.domain.entities.Localidad;
import org.springframework.stereotype.Service;

@Service
public class LocalidadFacadeImp extends BaseFacadeImp<Localidad, LocalidadDto, LocalidadCreateDto, LocalidadCreateDto, Long> implements LocalidadFacade {
    public LocalidadFacadeImp(BaseService<Localidad, Long> baseService, BaseMapper<Localidad, LocalidadDto, LocalidadCreateDto, LocalidadCreateDto> baseMapper) {
        super(baseService, baseMapper);
    }
}

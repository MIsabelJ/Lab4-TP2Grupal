package com.example.buensaborback.business.facade.Imp;

import com.example.buensaborback.business.facade.Base.BaseFacadeImp;
import com.example.buensaborback.business.facade.SucursalFacade;
import com.example.buensaborback.business.mapper.BaseMapper;
import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.domain.dtos.SucursalDto.SucursalCreateDto;
import com.example.buensaborback.domain.dtos.SucursalDto.SucursalDto;
import com.example.buensaborback.domain.entities.Sucursal;
import org.springframework.stereotype.Service;

@Service
public class SucursalFacadeImp extends BaseFacadeImp<Sucursal, SucursalDto, SucursalCreateDto, SucursalCreateDto, Long> implements SucursalFacade {
    public SucursalFacadeImp(BaseService<Sucursal, Long> baseService, BaseMapper<Sucursal, SucursalDto, SucursalCreateDto, SucursalCreateDto> baseMapper) {
        super(baseService, baseMapper);
    }
}

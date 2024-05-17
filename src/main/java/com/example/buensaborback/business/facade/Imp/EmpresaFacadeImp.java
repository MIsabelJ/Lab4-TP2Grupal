package com.example.buensaborback.business.facade.Imp;

import com.example.buensaborback.business.facade.Base.BaseFacadeImp;
import com.example.buensaborback.business.facade.EmpresaFacade;
import com.example.buensaborback.business.mapper.BaseMapper;
import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.domain.dtos.EmpresaDto.EmpresaCreateDto;
import com.example.buensaborback.domain.dtos.EmpresaDto.EmpresaDto;
import com.example.buensaborback.domain.entities.Empresa;
import org.springframework.stereotype.Service;

@Service
public class EmpresaFacadeImp extends BaseFacadeImp<Empresa, EmpresaDto, EmpresaCreateDto, EmpresaCreateDto, Long> implements EmpresaFacade {
    public EmpresaFacadeImp(BaseService<Empresa, Long> baseService, BaseMapper<Empresa, EmpresaDto, EmpresaCreateDto, EmpresaCreateDto> baseMapper) {
        super(baseService, baseMapper);
    }
}

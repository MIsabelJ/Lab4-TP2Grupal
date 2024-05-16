package com.example.buensaborback.business.facade.Imp;

import com.example.buensaborback.business.facade.Base.BaseFacadeImp;
import com.example.buensaborback.business.facade.PaisFacade;
import com.example.buensaborback.business.mapper.BaseMapper;
import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.domain.dtos.PaisDto.PaisCreateDto;
import com.example.buensaborback.domain.dtos.PaisDto.PaisDto;
import com.example.buensaborback.domain.entities.Pais;
import org.springframework.stereotype.Service;

@Service
public class PaisFacadeImp extends BaseFacadeImp<Pais, PaisDto, PaisCreateDto, PaisCreateDto, Long> implements PaisFacade {
    public PaisFacadeImp(BaseService<Pais, Long> baseService, BaseMapper<Pais, PaisDto, PaisCreateDto, PaisCreateDto> baseMapper) {
        super(baseService, baseMapper);
    }
}

package com.example.buensaborback.business.facade.Imp;

import com.example.buensaborback.business.facade.Base.BaseFacadeImp;
import com.example.buensaborback.business.facade.PromocionFacade;
import com.example.buensaborback.business.mapper.BaseMapper;
import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.domain.dtos.PromocionDto.PromocionCreateDto;
import com.example.buensaborback.domain.dtos.PromocionDto.PromocionDto;
import com.example.buensaborback.domain.entities.Promocion;
import org.springframework.stereotype.Service;

@Service
public class PromocionFacadeImp extends BaseFacadeImp<Promocion, PromocionDto, PromocionCreateDto, PromocionCreateDto, Long> implements PromocionFacade {
    public PromocionFacadeImp(BaseService<Promocion, Long> baseService, BaseMapper<Promocion, PromocionDto, PromocionCreateDto, PromocionCreateDto> baseMapper) {
        super(baseService, baseMapper);
    }
}

package com.example.buensaborback.business.facade.Imp;

import com.example.buensaborback.business.facade.ArticuloManufacturadoFacade;
import com.example.buensaborback.business.facade.Base.BaseFacadeImp;
import com.example.buensaborback.business.mapper.ArticuloManufacturadoMapper;
import com.example.buensaborback.business.mapper.BaseMapper;
import com.example.buensaborback.business.service.ArticuloManufacturadoService;
import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.business.service.Imp.ArticuloManufacturadoServiceImp;
import com.example.buensaborback.domain.dtos.ArticuloManufacturadoDto.ArticuloManufacturadoCreateDto;
import com.example.buensaborback.domain.dtos.ArticuloManufacturadoDto.ArticuloManufacturadoDto;
import com.example.buensaborback.domain.entities.ArticuloManufacturado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticuloManufacturadoFacadeImp extends BaseFacadeImp<ArticuloManufacturado, ArticuloManufacturadoDto, ArticuloManufacturadoCreateDto, ArticuloManufacturadoCreateDto, Long> implements ArticuloManufacturadoFacade {
    public ArticuloManufacturadoFacadeImp(BaseService<ArticuloManufacturado, Long> baseService, BaseMapper<ArticuloManufacturado, ArticuloManufacturadoDto, ArticuloManufacturadoCreateDto, ArticuloManufacturadoCreateDto> baseMapper) {
        super(baseService, baseMapper);
    }
    @Autowired
    ArticuloManufacturadoMapper articuloManufacturadoMapper;
    @Autowired
    ArticuloManufacturadoService articuloManufacturadoService;

    @Override
    public ArticuloManufacturadoDto addPromocion(Long idArticuloManufacturado, Long idPromocion){
        return articuloManufacturadoMapper.toDTO(articuloManufacturadoService.addPromocion(idArticuloManufacturado, idPromocion));
    }
    @Override
    public ArticuloManufacturadoDto addArticuloInsumo(Long idArticuloManufacturado, Long idArticuloInsumo){
        return articuloManufacturadoMapper.toDTO(articuloManufacturadoService.addPromocion(idArticuloManufacturado, idArticuloInsumo));
    }
}

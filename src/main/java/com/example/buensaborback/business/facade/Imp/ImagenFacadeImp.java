package com.example.buensaborback.business.facade.Imp;

import com.example.buensaborback.business.facade.Base.BaseFacadeImp;
import com.example.buensaborback.business.facade.ImagenFacade;
import com.example.buensaborback.business.mapper.BaseMapper;
import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.domain.dtos.ImagenDto.ImagenCreateDto;
import com.example.buensaborback.domain.dtos.ImagenDto.ImagenDto;
import com.example.buensaborback.domain.entities.Imagen;
import org.springframework.stereotype.Service;

@Service
public class ImagenFacadeImp extends BaseFacadeImp<Imagen, ImagenDto, ImagenCreateDto, ImagenCreateDto, Long> implements ImagenFacade {
    public ImagenFacadeImp(BaseService<Imagen, Long> baseService, BaseMapper<Imagen, ImagenDto, ImagenCreateDto, ImagenCreateDto> baseMapper) {
        super(baseService, baseMapper);
    }
}

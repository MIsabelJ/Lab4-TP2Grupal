package com.example.buensaborback.business.facade;

import com.example.buensaborback.business.facade.Base.BaseFacade;
import com.example.buensaborback.domain.dtos.ImagenDto.ImagenCreateDto;
import com.example.buensaborback.domain.dtos.ImagenDto.ImagenDto;

public interface ImagenFacade extends BaseFacade<ImagenDto, ImagenCreateDto, ImagenCreateDto, Long> {
}

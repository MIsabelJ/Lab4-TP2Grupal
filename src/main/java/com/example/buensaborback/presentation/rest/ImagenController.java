package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.Imp.ImagenFacadeImp;
import com.example.buensaborback.domain.dtos.ImagenDto.ImagenCreateDto;
import com.example.buensaborback.domain.dtos.ImagenDto.ImagenDto;
import com.example.buensaborback.domain.entities.Imagen;
import com.example.buensaborback.presentation.rest.Base.BaseControllerImp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imagen")
@CrossOrigin("*")
public class ImagenController extends BaseControllerImp<Imagen, ImagenDto, ImagenCreateDto, ImagenCreateDto, Long, ImagenFacadeImp> {
    public ImagenController(ImagenFacadeImp facade) {
        super(facade);
    }
}

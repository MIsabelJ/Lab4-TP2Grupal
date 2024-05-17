package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.Imp.LocalidadFacadeImp;
import com.example.buensaborback.domain.dtos.LocalidadDto.LocalidadCreateDto;
import com.example.buensaborback.domain.dtos.LocalidadDto.LocalidadDto;
import com.example.buensaborback.domain.entities.Localidad;
import com.example.buensaborback.presentation.rest.Base.BaseControllerImp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Localidad")
@CrossOrigin("*")
public class LocalidadController extends BaseControllerImp<Localidad, LocalidadDto, LocalidadCreateDto, LocalidadCreateDto, Long, LocalidadFacadeImp> {
    public LocalidadController(LocalidadFacadeImp facade) {
        super(facade);
    }
}

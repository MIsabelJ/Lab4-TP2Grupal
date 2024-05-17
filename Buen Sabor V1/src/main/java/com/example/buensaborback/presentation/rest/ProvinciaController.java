package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.Imp.ProvinciaFacadeImp;
import com.example.buensaborback.domain.dtos.ProvinciaDto.ProvinciaCreateDto;
import com.example.buensaborback.domain.dtos.ProvinciaDto.ProvinciaDto;
import com.example.buensaborback.domain.entities.Provincia;
import com.example.buensaborback.presentation.rest.Base.BaseControllerImp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Provincia")
@CrossOrigin("*")
public class ProvinciaController extends BaseControllerImp<Provincia, ProvinciaDto, ProvinciaCreateDto, ProvinciaCreateDto, Long, ProvinciaFacadeImp> {
    public ProvinciaController(ProvinciaFacadeImp facade) {
        super(facade);
    }
}

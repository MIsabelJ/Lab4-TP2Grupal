package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.Imp.DomicilioFacadeImp;
import com.example.buensaborback.domain.dtos.DomicilioDto.DomicilioCreateDto;
import com.example.buensaborback.domain.dtos.DomicilioDto.DomicilioDto;
import com.example.buensaborback.domain.entities.Domicilio;
import com.example.buensaborback.presentation.rest.Base.BaseControllerImp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/domicilio")
@CrossOrigin("*")
public class DomicilioController extends BaseControllerImp<Domicilio, DomicilioDto, DomicilioCreateDto, DomicilioCreateDto, Long, DomicilioFacadeImp> {
    public DomicilioController(DomicilioFacadeImp facade) {
        super(facade);
    }
}

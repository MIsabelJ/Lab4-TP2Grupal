package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.Imp.SucursalFacadeImp;
import com.example.buensaborback.domain.dtos.SucursalDto.SucursalCreateDto;
import com.example.buensaborback.domain.dtos.SucursalDto.SucursalDto;
import com.example.buensaborback.domain.entities.Sucursal;
import com.example.buensaborback.presentation.rest.Base.BaseControllerImp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sucursal")
@CrossOrigin("*")
public class SucursalController extends BaseControllerImp<Sucursal, SucursalDto, SucursalCreateDto, SucursalCreateDto, Long, SucursalFacadeImp> {
    public SucursalController(SucursalFacadeImp facade) {
        super(facade);
    }
}

package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.Imp.EmpresaFacadeImp;
import com.example.buensaborback.domain.dtos.EmpresaDto.EmpresaCreateDto;
import com.example.buensaborback.domain.dtos.EmpresaDto.EmpresaDto;
import com.example.buensaborback.domain.entities.Empresa;
import com.example.buensaborback.presentation.rest.Base.BaseControllerImp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresa")
@CrossOrigin("*")
public class EmpresaController extends BaseControllerImp<Empresa, EmpresaDto, EmpresaCreateDto, EmpresaCreateDto, Long, EmpresaFacadeImp> {
    public EmpresaController(EmpresaFacadeImp facade) {
        super(facade);
    }
}

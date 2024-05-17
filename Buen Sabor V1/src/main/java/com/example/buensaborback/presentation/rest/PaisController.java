package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.Imp.PaisFacadeImp;
import com.example.buensaborback.domain.dtos.PaisDto.PaisCreateDto;
import com.example.buensaborback.domain.dtos.PaisDto.PaisDto;
import com.example.buensaborback.domain.entities.Pais;
import com.example.buensaborback.presentation.rest.Base.BaseControllerImp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Pais")
@CrossOrigin("*")
public class PaisController extends BaseControllerImp<Pais, PaisDto, PaisCreateDto, PaisCreateDto, Long, PaisFacadeImp> {
    public PaisController(PaisFacadeImp facade) {
        super(facade);
    }
}

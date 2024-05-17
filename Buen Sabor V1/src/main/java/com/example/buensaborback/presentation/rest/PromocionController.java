package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.Imp.PromocionFacadeImp;
import com.example.buensaborback.domain.dtos.PromocionDto.PromocionCreateDto;
import com.example.buensaborback.domain.dtos.PromocionDto.PromocionDto;
import com.example.buensaborback.domain.entities.Promocion;
import com.example.buensaborback.presentation.rest.Base.BaseControllerImp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/promocion")
@CrossOrigin("*")
public class PromocionController extends BaseControllerImp<Promocion, PromocionDto, PromocionCreateDto, PromocionCreateDto, Long, PromocionFacadeImp> {
    public PromocionController(PromocionFacadeImp facade) {
        super(facade);
    }
}

package com.example.buensaborback.business.service;

import com.example.buensaborback.business.service.Base.BaseService;
import com.example.buensaborback.domain.entities.ArticuloManufacturado;

public interface ArticuloManufacturadoService extends BaseService<ArticuloManufacturado,Long> {
    public ArticuloManufacturado addPromocion(Long idArticuloManufacturado, Long idSucursal);
    public ArticuloManufacturado addArticuloInsumo(Long idArticuloManufacturado, Long idArticuloInsumo);
}

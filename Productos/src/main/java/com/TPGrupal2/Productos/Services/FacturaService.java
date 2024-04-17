package com.TPGrupal2.Productos.Services;

import com.TPGrupal2.Productos.Entities.Factura;
import com.TPGrupal2.Productos.Repositories.BaseRepository;
import com.TPGrupal2.Productos.Repositories.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaService extends BaseServiceImpl<Factura, Long> {
    @Autowired
    private FacturaRepository facturaRepository;

    public FacturaService(BaseRepository<Factura, Long> baseRepository){
        super(baseRepository);
    }

}

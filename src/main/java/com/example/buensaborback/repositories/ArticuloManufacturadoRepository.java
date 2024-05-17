package com.example.buensaborback.repositories;

import com.example.buensaborback.domain.entities.ArticuloManufacturado;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloManufacturadoRepository extends BaseRepository<ArticuloManufacturado,Long> {
    @Query("SELECT e FROM ArticuloManufacturado e LEFT JOIN FETCH e.estaEnPromociones WHERE e.id = :id")
    ArticuloManufacturado findWithPromocionesById(@Param("id") Long id);
}

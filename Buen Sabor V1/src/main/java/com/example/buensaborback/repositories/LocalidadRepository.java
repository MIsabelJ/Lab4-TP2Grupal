package com.example.buensaborback.repositories;

import com.example.buensaborback.domain.entities.Localidad;

import java.util.List;

public interface LocalidadRepository extends BaseRepository<Localidad,Long> {
    List<Localidad> findByProvinciaId(Long id);
}

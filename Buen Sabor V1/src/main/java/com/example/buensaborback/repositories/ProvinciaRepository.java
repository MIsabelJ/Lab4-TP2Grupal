package com.example.buensaborback.repositories;

import com.example.buensaborback.domain.entities.Provincia;

import java.util.List;

public interface ProvinciaRepository extends BaseRepository<Provincia,Long> {
    Provincia findByNombre(String provinciaNombre);
    List<Provincia> findByPaisId(Long id);
}

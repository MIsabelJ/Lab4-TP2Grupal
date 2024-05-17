package com.example.buensaborback.repositories;

import com.example.buensaborback.domain.entities.Categoria;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends BaseRepository<Categoria,Long> {

    @Query("SELECT e FROM Categoria e LEFT JOIN FETCH e.sucursales WHERE e.id = :id")
    Categoria findWithSucursalesById(@Param("id") Long id);

}

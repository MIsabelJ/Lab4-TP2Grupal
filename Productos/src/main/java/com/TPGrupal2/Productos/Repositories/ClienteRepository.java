package com.TPGrupal2.Productos.Repositories;

import com.TPGrupal2.Productos.Entities.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends BaseRepository<Cliente, Long> {
}

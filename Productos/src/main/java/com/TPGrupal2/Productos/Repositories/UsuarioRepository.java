package com.TPGrupal2.Productos.Repositories;

import com.TPGrupal2.Productos.Entities.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends BaseRepository<Usuario, Long> {
}

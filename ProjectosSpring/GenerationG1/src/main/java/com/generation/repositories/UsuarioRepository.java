package com.generation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{ //JpaRepository<Usuario, aqui en esta línea debe ir el tipo de dato de la PK>
	/** las interface solo definen los métodos */
	/** Querys y usar metodo que se conectan a la base de datos */

}

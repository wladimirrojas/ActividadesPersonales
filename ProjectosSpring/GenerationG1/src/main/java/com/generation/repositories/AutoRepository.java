package com.generation.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.generation.models.Auto;

@Repository
public interface AutoRepository extends JpaRepository<Auto, Integer>{

	//JPQL
	//Usamos objeto con hibernate
	@Query("SELECT a FROM Auto a WHERE a.marca = ?1")
	List<Auto> findAllAutoMarca(String marca);
	
	//Query comun
	@Query(value="SELECT * FROM autos a WHERE a.marca = ?1", nativeQuery = true)
	List<Auto> buscarMarca(String marca);
	
	//object ya que no retornamos el objeto auto directamente al traer columnas específicas
	/*@Query(value="SELECT a.marca, a.color FROM autos a WHERE a.marca = ?1 and a.color=?2", nativeQuery = true)
	List<Object[]> buscarMarcaColor(String marca, String color);*/
	
	//INNERJOIN entre autos y compraventa a través de la clase auto con la lista compraventa
	@Query("SELECT a FROM Auto a JOIN a.compraVentas cv")
	List<Auto> buscarAutosVendidos();
	
	
}

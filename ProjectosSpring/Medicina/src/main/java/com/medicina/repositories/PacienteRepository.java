package com.medicina.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicina.models.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}

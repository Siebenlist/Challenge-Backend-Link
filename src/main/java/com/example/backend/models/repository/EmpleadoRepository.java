package com.example.backend.models.repository;

import com.example.backend.models.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    Optional<Empleado> findByDni(String dni);
    List<Empleado> findByFechaVisualizacion(LocalDate fechaVisualizacion);
}

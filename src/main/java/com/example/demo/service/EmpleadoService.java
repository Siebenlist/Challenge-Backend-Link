package com.example.demo.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.demo.dto.EmpleadoDTO;
import com.example.demo.dto.EmpleadoResponse;
import com.example.demo.models.Empleado;
import com.example.demo.repository.EmpleadoRepository;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmpleadoService {

    private static final Logger LOG = LoggerFactory.getLogger(EmpleadoService.class);

    @Autowired
    private EmpleadoRepository empleadoRepository;

    public EmpleadoResponse autenticacion(String dni){

        LOG.info("Dni de usuario: {}", dni);

        Optional<Empleado> empleadoOpt = empleadoRepository.findByDni(dni);

        if(empleadoOpt.isPresent()){
             Empleado empleado = empleadoOpt.get();

            if(empleado.getImporte() == null){
                empleado.setFechaVisualizacion(LocalDate.now());
                empleadoRepository.save(empleado);
                return new EmpleadoResponse(false, true, null, "Prestamo invalido para el empleado con dni: " + dni, 406);
            }

            empleado.setFechaVisualizacion(LocalDate.now());
            empleadoRepository.save(empleado);
            return new EmpleadoResponse(true, true, empleado.getImporte(), "Prestamo disponible con el importe: " + empleado.getImporte(), 200);
        }

        return new EmpleadoResponse(true, dni, "Empleado no encontrado con el dni: " + dni, 404);

    }


    public List<EmpleadoDTO> listaEmpleados() {

        List<Empleado> listaEmpleados = empleadoRepository.findByFechaVisualizacion(LocalDate.now());

        return listaEmpleados.stream().map(e -> new EmpleadoDTO(e)).collect(Collectors.toList());

    }

}

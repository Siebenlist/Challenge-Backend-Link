package com.example.demo;

import com.example.demo.controller.EmpleadoController;
import com.example.demo.dto.AutenticacionRequest;
import com.example.demo.dto.EmpleadoResponse;
import com.example.demo.models.Empleado;
import com.example.demo.repository.EmpleadoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

@SpringBootTest
public class EmpleadoValidoPrestamoCaseTest {

    @Autowired
    private EmpleadoController empleadoController;

    @Autowired
    private EmpleadoRepository empleadoRepository;

    private String dni;
    private Double importe;

    @BeforeEach
    void setup(){
        Empleado empleado = empleadoRepository.save(new Empleado("1", 1000.0));
        this.dni = empleado.getDni();
        this.importe = empleado.getImporte();
    }

    @Test
    void ok(){
        AutenticacionRequest request = new AutenticacionRequest(dni);

        ResponseEntity<EmpleadoResponse> response = empleadoController.autenticacion(request);

        Assertions.assertEquals(response.getStatusCode(), HttpStatus.OK);
        Assertions.assertEquals(response.getBody().getRespuesta(), "Prestamo disponible con el importe: " + importe);
    }
}

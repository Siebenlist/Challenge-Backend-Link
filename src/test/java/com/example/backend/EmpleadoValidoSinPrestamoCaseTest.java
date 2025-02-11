package com.example.backend;

import com.example.backend.controller.EmpleadoController;
import com.example.backend.dto.AutenticacionRequest;
import com.example.backend.dto.EmpleadoResponse;
import com.example.backend.models.Empleado;
import com.example.backend.repository.EmpleadoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class EmpleadoValidoSinPrestamoCaseTest {
    @Autowired
    private EmpleadoController controller;
    @Autowired
    private EmpleadoRepository repository;
    private String dni;

    @BeforeEach
    void setup() {
        var empleado = repository.save(new Empleado("1", null));
        this.dni = empleado.getDni();
    }

    @Test
    void ok() {
        AutenticacionRequest request = new AutenticacionRequest(dni);

        ResponseEntity<EmpleadoResponse> response = controller.autenticacion(request);
        Assertions.assertEquals(response.getStatusCode(), HttpStatus.NOT_ACCEPTABLE);
        Assertions.assertEquals(response.getBody().getRespuesta(), "Prestamo invalido para el empleado con dni: " + dni);
    }
}

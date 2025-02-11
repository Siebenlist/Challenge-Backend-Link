package com.example.demo;

import com.example.demo.controller.EmpleadoController;
import com.example.demo.dto.AutenticacionRequest;
import com.example.demo.dto.EmpleadoResponse;
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
public class DniValidoCaseTest {

    @Autowired
    private EmpleadoController empleadoController;

    @Autowired
    private EmpleadoRepository empleadoRepository;

    private String dni;

    @BeforeEach
    void setup() {
        dni = "2";
    }

    @Test
    void ok(){
        AutenticacionRequest request = new AutenticacionRequest(dni);

        ResponseEntity<EmpleadoResponse> response = empleadoController.autenticacion(request);

        Assertions.assertEquals(response.getStatusCode(), HttpStatus.NOT_FOUND);
        Assertions.assertEquals(response.getBody().getRespuesta(), "Empleado no encontrado con el dni: " + dni);
    }


}

package com.example.backend.controller;

import com.example.backend.dto.AutenticacionRequest;
import com.example.backend.dto.EmpleadoResponse;
import com.example.backend.dto.ListEmpleadoReponse;
import com.example.backend.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @PostMapping("/validar")
    public ResponseEntity<EmpleadoResponse> autenticacion(@RequestBody AutenticacionRequest request){

        EmpleadoResponse empleadoResponse = empleadoService.autenticacion(request.getDni());

        if(empleadoResponse.getCodigo() == 406){
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(empleadoResponse);
        }

        if(empleadoResponse.getCodigo() == 404){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(empleadoResponse);
        }

        return ResponseEntity.ok(empleadoResponse);
    }

    @GetMapping("/detalles")
    public ResponseEntity<ListEmpleadoReponse> prueba(){
        ListEmpleadoReponse response = new ListEmpleadoReponse(empleadoService.listaEmpleados());

        return ResponseEntity.ok(response);
    }


}

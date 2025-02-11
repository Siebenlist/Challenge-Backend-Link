package com.example.demo.dto;

public class AutenticacionRequest {

    private String dni;

    public AutenticacionRequest() {}

    public AutenticacionRequest(String dni){
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}

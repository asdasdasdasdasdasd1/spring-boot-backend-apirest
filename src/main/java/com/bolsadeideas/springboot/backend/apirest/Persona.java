package com.bolsadeideas.springboot.backend.apirest;

public class Persona {

    String nombre;
    int edad;

    public Persona() {}

    public Persona(String nombre, int edad) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public String mostrar() {
        return this.edad + " " +this.nombre;
    }
}

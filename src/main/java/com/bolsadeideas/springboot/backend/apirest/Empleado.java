package com.bolsadeideas.springboot.backend.apirest;
public class Empleado extends Persona {

    public Empleado() {}

    public Empleado(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String mostrar() {

        Persona persona = new Persona() {
            @Override
            public String mostrar() {
                System.out.println("Implementacion en clase anonima.");
                return "Hola mundo - anonima";
            }
        };

       return persona.mostrar();
    }
}

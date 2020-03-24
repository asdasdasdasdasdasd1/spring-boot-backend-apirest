package com.bolsadeideas.springboot.backend.apirest;

import org.springframework.stereotype.Component;

@FunctionalInterface
@Component
public interface IPersona {

    default String mostrarFI() {
        return "Hola POR DEFECTO";
    }

    String mostrarFI(String name);

    // default int mostrarFI2() { return 1; }

    //int mostrarFI2(int name);

}

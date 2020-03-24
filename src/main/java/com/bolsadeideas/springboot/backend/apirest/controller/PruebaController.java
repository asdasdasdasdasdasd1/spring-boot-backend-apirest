package com.bolsadeideas.springboot.backend.apirest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class PruebaController {

    @GetMapping("persons/")
    public Mono<String> getAllPersons() {
        return Mono.just("{name: Brian}");
    }
}

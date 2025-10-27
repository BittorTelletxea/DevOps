package com.example.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.Usuario;

@RestController
public class HolaController {

    @GetMapping("/hola")
    public String hola() {
        return "Hello World!";
    }
    
    @GetMapping("/usuario")
    public Usuario obtenerUsuario() {
        return new Usuario("Juan", 30);
    }
    

    @GetMapping("/")
    public String root() {
        return "Bienvenido a mi API";
    }

}

package com.example.biolab.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExemploController {

@GetMapping(value = "/msg")
    public String mostrarMsg(){
        return "Olá Mundo";
    }

@PostMapping
    public String criar(@RequestBody String nome, String email){
        return "Criado com sucesso, O nome e email são: "
                + nome + email;

    }
}

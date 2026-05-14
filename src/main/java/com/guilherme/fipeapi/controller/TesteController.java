package com.guilherme.fipeapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.guilherme.fipeapi.model.Carro;

@RestController
public class TesteController {

    @GetMapping("/teste/{nome}/{marca}")
    public Carro teste(@PathVariable String nome, @PathVariable String marca){

        Carro carro = new Carro();
        carro.nome = nome;
        carro.marca = marca;

        return carro;
    }
  
}

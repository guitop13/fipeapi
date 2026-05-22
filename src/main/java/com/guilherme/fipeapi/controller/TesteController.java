package com.guilherme.fipeapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
/*responsavel por buscar informações em outras api
nesse caso é tipo assim: restTemplate.getForObject(...) significa olha busca(get) informações desse local
e mostra pra mim: abaixo voce se deparara com String.class, que pe basicamente indicando qual a forma de resposat quero obter
nesse caso string*/

@RestController
public class TesteController {

    RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/cep")
    public String buscarCep() {

        String resultado = restTemplate.getForObject(
            "https://viacep.com.br/ws/72543506/json/",
            String.class
        );

        return resultado;
    }

}
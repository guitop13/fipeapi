package com.guilherme.fipeapi.controller;

import org.springframework.web.bind.annotation.GetMapping;/*ele vai criar rotas para acessar meus metodos
exemplo: @GetMapping("/cep") quando for chamado cep acessa esse metodo*/
import org.springframework.web.bind.annotation.RestController; /* annotion.RestController= 
uma etiqueta que vai fazer com que minha classe converse na web/API
ela indica que uma classe responda requisições http
pensa assim: vai ter uma requisição http, o spring vai procura algo que tenha a etiqueta(RestController)-
que que atenda ao pedido, o spring vai pegar tranforma em http e enviar o chamado*/
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
package br.com.smarttec.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/recuparar-senha")
public class RecuperarSenhaController {

    @PostMapping
    public void post() {
        // TODO
    }
}

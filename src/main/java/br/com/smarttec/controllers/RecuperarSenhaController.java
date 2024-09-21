package br.com.smarttec.controllers;

import br.com.smarttec.dtos.RecuperarSenhaRequestDto;
import br.com.smarttec.dtos.RecuperarSenhaResponseDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/recuparar-senha")
public class RecuperarSenhaController {

    @PostMapping
    public ResponseEntity<RecuperarSenhaResponseDto> post(@RequestBody @Valid RecuperarSenhaRequestDto dto) {
        return null;
    }
}

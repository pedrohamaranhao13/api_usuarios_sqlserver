package br.com.smarttec.controllers;

import br.com.smarttec.dtos.AutenticarRequestDto;
import br.com.smarttec.dtos.AutenticarResponseDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/autenticar")
public class AutenticarController {

    @PostMapping
    public ResponseEntity<AutenticarResponseDto> post(@RequestBody @Valid AutenticarRequestDto dto) {
        return null;
    }
}

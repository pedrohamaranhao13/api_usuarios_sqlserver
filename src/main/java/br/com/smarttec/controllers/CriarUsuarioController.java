package br.com.smarttec.controllers;

import br.com.smarttec.dtos.CriarUsuarioRequestDto;
import br.com.smarttec.dtos.CriarUsuarioResponseDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/criar-usuario")
public class CriarUsuarioController {

    @PostMapping
    public ResponseEntity<CriarUsuarioResponseDto> post(@RequestBody @Valid CriarUsuarioRequestDto dto) {
        return null;
    }
}

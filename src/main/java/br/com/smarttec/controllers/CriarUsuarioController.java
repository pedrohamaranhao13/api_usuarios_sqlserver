package br.com.smarttec.controllers;

import br.com.smarttec.dtos.CriarUsuarioRequestDto;
import br.com.smarttec.dtos.CriarUsuarioResponseDto;
import br.com.smarttec.entities.Usuario;
import br.com.smarttec.repositories.UsuarioRepository;
import br.com.smarttec.services.MD5Service;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/criar-usuario")
public class CriarUsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private MD5Service md5Service;

    @PostMapping
    public ResponseEntity<CriarUsuarioResponseDto> post(@RequestBody @Valid CriarUsuarioRequestDto dto) {

        CriarUsuarioResponseDto response = new CriarUsuarioResponseDto();

        try {

            if (usuarioRepository.findByEmail(dto.getEmail()).isPresent()) {

                response.setStatus(400);
                response.setMensagem("O e-mail informado já foi cadastrado.");

            } else {

                Usuario usuario = new Usuario();
                usuario.setNome(dto.getNome());
                usuario.setEmail(dto.getEmail());
                usuario.setSenha(dto.getSenha());

                usuarioRepository.save(usuario);

                response.setStatus(201);
                response.setMensagem("Usuário cadastrado com sucesso");
                response.setIdUsuario(usuario.getIdUsuario());
                response.setNome(usuario.getNome());
                response.setEmail(md5Service.encrypt(usuario.getEmail()));

            }

        } catch (Exception e) {
            response.setStatus(500);
            response.setMensagem("Não foi possível cadastrar usuário " + e.getMessage());
        }

        return ResponseEntity.status(response.getStatus()).body(response);
    }
}

package br.com.smarttec.dtos;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CriarUsuarioResponseDto {

    private Integer status;
    private String mensagem;
    private Integer idUsuario;
    private String nome;
    private String email;

}

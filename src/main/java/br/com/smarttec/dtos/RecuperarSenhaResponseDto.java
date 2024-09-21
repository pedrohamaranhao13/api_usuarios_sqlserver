package br.com.smarttec.dtos;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RecuperarSenhaResponseDto {

    private Integer status;
    private String mensagem;
}

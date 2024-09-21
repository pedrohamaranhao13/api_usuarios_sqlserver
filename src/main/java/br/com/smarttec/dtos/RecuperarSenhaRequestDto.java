package br.com.smarttec.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RecuperarSenhaRequestDto {

    @Email(message = "Preencha um e-mail válido")
    @NotBlank(message = "Campo obrigatório, informe o e-mail do usuário.")
    private String email;
}

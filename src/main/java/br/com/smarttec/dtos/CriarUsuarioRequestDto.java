package br.com.smarttec.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CriarUsuarioRequestDto {

    @Size(min = 8, max = 150, message = "Informe um nome de 8 a 150 caracteres")
    @NotBlank(message = "Informe o nome do usuário")
    private String nome;

    @Email(message = "Por favor, informe um endereço de e-mail válido")
    @NotBlank(message = "Informe o e-mail do usuário.")
    private String email;

    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = "Por favor, informe uma senha com números, com letras maiúsculas e minúsculas, símbolos e no mínimo 8 caracteres")
    @NotBlank(message = "Informe a senha do usuário")
    private String senha;

}

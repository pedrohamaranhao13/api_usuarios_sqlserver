package br.com.smarttec.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AutenticarRequestDto {

    @Email(message = "Por favor, informe um e-mail válido.")
    @NotBlank(message = "Por favor, informe o e-mail do usuário. ")
    private String email;

    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = "Por favor, informe uma senha com números, com letras maiúsculas e minúsculas, símbolos e no mínimo 8 caracteres")
    @NotBlank(message = "Por favor, informe a senha do usuário.")
    private String senha;
}

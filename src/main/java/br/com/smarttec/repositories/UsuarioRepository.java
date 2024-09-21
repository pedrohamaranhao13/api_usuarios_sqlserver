package br.com.smarttec.repositories;

import br.com.smarttec.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    @Query("select u from Usuario u where email = :email")
    List<Usuario> findByEmail(@Param("email") String email);

    @Query("select u from Usuario u where email = :email and senha = :senha")
    Optional<Usuario> findByEmailAndSenha(@Param("email") String email, @Param("senha") String senha);
}

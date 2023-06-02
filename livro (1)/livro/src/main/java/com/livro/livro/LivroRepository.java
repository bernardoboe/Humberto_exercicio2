package com.livro.livro;

import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends CrudRepository<Livro, String> {
    
    @Query("SELECT l from Livro l where l.titulo = :t")
    Optional<Livro> findByTitulo(@Param("t") String titulo);
}

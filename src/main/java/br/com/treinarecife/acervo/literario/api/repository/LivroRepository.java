
package br.com.treinarecife.acervo.literario.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinarecife.acervo.literario.api.entity.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

    // Buscar livros por nome da categoria
    List<Livro> findByCategoriasNome(String nome);

    // Buscar livros por trecho do título
    List<Livro> findByTituloContainingIgnoreCase(String termo);

}

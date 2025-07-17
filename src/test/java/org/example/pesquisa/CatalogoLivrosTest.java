package org.example.pesquisa;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CatalogoLivrosTest {

    @Test
    void adicionarLivro() {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Código Limpo", "Diego", 2012);

        List<Livro> livros = catalogoLivros.getLivros();
        assertEquals(1, livros.size());

        Livro livroAdicionado = livros.get(0);
        assertEquals("Código Limpo", livroAdicionado.getTitulo());
        assertEquals("Diego", livroAdicionado.getAutor());
        assertEquals(2012, livroAdicionado.getAnoDePublicacao());
    }

    @Test
    void pesquisarPorAutor() {

        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("Código Limpo", "Robert C. Martin", 2008);
        catalogo.adicionarLivro("O Programador Pragmático", "Andy Hunt", 1999);
        catalogo.adicionarLivro("Arquitetura Limpa", "Robert C. Martin", 2017);

        List<Livro> livros = catalogo.getLivros();
        assertEquals(3, livros.size());

        List<Livro> encontrarLivro = catalogo.pesquisarPorAutor("Andy Hunt");

        boolean livrosEncontrados = encontrarLivro.stream()
                .anyMatch(livro ->
                        livro.getAutor().equals("Andy Hunt")
                );
        assertTrue(livrosEncontrados, "Livro do autor esperado não foi encontrado!");

    }

}
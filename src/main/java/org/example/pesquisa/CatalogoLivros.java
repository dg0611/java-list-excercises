package org.example.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaDeLivros = new ArrayList<>();

    public CatalogoLivros() {
        this.listaDeLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listaDeLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livosEncontrados = new ArrayList<>();
        if (!listaDeLivros.isEmpty()) {
            for (Livro l : listaDeLivros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livosEncontrados.add(l);
                }
            }
        }
        return livosEncontrados;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        return (List<Livro>) listaDeLivros.stream().map(it ->
                it.getAnoDePublicacao() >= anoInicial && it.getAnoDePublicacao() <= anoFinal);
    }

    public void pesquisarPorTitulo(String titulo) {
        Livro tituloLocalizado = null;
        if (!listaDeLivros.isEmpty()) {
            for (Livro l : listaDeLivros) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    tituloLocalizado = l;
                }
            }
        }
    }

    public List<Livro> getLivros() {
        return listaDeLivros;
    }


}

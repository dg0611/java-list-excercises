package org.example.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listaDePesoas = new ArrayList<>();

    public OrdenacaoPessoas() {
        this.listaDePesoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listaDePesoas.add(new Pessoa(nome, idade, altura));
    }

    //Ordena as pessoas da lista por idade usando a interface Comparable.
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> ordenadoPorIdade = new ArrayList<>(listaDePesoas);
        Collections.sort(ordenadoPorIdade);
        return ordenadoPorIdade;
    }

    //Ordena as pessoas da lista por altura usando um Comparator personalizado.
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> ordenadoPorAltura = new ArrayList<>(listaDePesoas);
        ordenadoPorAltura.sort(new ComparatorPorAltura());
        return ordenadoPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Joao", 21, 1.78);
        ordenacaoPessoas.adicionarPessoa("Joaquim", 18, 1.68);
        ordenacaoPessoas.adicionarPessoa("Jose", 56, 1.89);
        ordenacaoPessoas.adicionarPessoa("Juliano", 13, 1.88);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());

    }
}




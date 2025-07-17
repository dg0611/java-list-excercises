package org.example.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listaDeNumeros;

    public OrdenacaoNumeros() {
        this.listaDeNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaDeNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> ordenacaoAscendente = new ArrayList<>(listaDeNumeros);
        if (!listaDeNumeros.isEmpty()) {
            Collections.sort(ordenacaoAscendente);
            return ordenacaoAscendente;
        } else {
            throw new RuntimeException("Lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> ordenacaoDescendente = new ArrayList<>(listaDeNumeros);
        if (!listaDeNumeros.isEmpty()) {
            ordenacaoDescendente.sort(Collections.reverseOrder());
            return ordenacaoDescendente;
        } else {
            throw new RuntimeException("Lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!listaDeNumeros.isEmpty()) {
            System.out.println(this.listaDeNumeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(7);
        numeros.adicionarNumero(3);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(10);
        numeros.adicionarNumero(89);

        //lista de números adicionados
        numeros.exibirNumeros();

        // Ordem ascendente
        System.out.println(numeros.ordenarAscendente());

        // Ordem descendente
        System.out.println(numeros.ordenarDescendente());

    }
}

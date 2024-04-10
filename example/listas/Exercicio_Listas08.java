package org.example.listas;

import java.util.ArrayList;

/* Limpando a Lista:
Escreva um programa que remova todos os elementos da lista, deixando-a vazia, e depois verifique
se a lista está vazia. Imprima uma mensagem indicando se a lista está vazia ou não.*/
public class Exercicio_Listas08 {
    public static void main(String[] args) {
        ArrayList<String> listaLasanha = new ArrayList<>();

        listaLasanha.add("Massa");
        listaLasanha.add("Queijo");
        listaLasanha.add("Presunto");
        listaLasanha.add("Oregano");
        listaLasanha.add("Carne Moida");
        listaLasanha.add("Molho de tomate");

        /* listaLasanha.remove(0); */

        listaLasanha.clear();
        System.out.println("A lista está vazia" + listaLasanha);
    }
}

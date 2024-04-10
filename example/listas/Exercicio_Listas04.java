package org.example.listas;

import java.util.ArrayList;

/* Verificando o Tamanho da Lista:
Escreva um programa que determine e imprima o tamanho da lista
que você criou nos exercícios anteriores.*/
public class Exercicio_Listas04 {
    public static void main(String[] args) {
        ArrayList<String> minhaLista = new ArrayList<>();

        minhaLista.add("Maçã");
        minhaLista.add("Banana");
        minhaLista.add("Cereja");
        minhaLista.add("Uva");

        System.out.println("O tamanho da minha lista é: " + minhaLista.size());
    }

}

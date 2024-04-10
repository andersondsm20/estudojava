package org.example.listas;

import java.util.ArrayList;

/* Removendo elementos da Lista:
Ainda usando a lista criada anteriormente, escreva um programa que remova o segundo elemento
(no caso, "Banana") e, em seguida, imprima a lista atualizada. */
public class Exercicio_Listas03 {
    public static void main(String[] args) {
        ArrayList<String> minhaLista = new ArrayList<>();

        minhaLista.add("Maçã");
        minhaLista.add("Banana");
        minhaLista.add("Cereja");
        minhaLista.add("Uva");

        minhaLista.remove(1);

        for (String listaatualizada : minhaLista)
            System.out.println(listaatualizada);
        }
}
package org.example.listas;

import java.util.ArrayList;

/*Iteração pela Lista:
Crie um programa que itere pela lista de frutas e imprima cada elemento em uma linha separada.*/
public class Exercicio_Listas05 {
    public static void main(String[] args) {
        ArrayList<String> minhaLista = new ArrayList<>();

        minhaLista.add("Maçã");
        minhaLista.add("Banana");
        minhaLista.add("Cereja");
        minhaLista.add("Uva");

        for (String fruta : minhaLista)
            System.out.println(fruta);
    }
}

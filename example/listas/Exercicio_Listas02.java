package org.example.listas;
import java.util.ArrayList;

/* Acessando Elementos da Lista:
A partir da lista criada no exercício anterior, escreva um programa
que acesse e imprima o terceiro elemento da lista. */
public class Exercicio_Listas02 {
    public static void main(String[] args) {
        ArrayList<String> minhaLista = new ArrayList<>();

        minhaLista.add("Maçã");
        minhaLista.add("Banana");
        minhaLista.add("Cereja");
        minhaLista.add("Uva");

        String terceiroElemento = minhaLista.get(2);
        System.out.println("Terceira Fruta: " + terceiroElemento);
    }
}

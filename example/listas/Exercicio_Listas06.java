package org.example.listas;

import java.util.ArrayList;
import java.util.Objects;

/* Verificando se um Elemento Existe na Lista:
Escreva um programa que verifique se a lista de frutas contém a fruta "Pêssego"
e imprima uma mensagem indicando se ela está na lista ou não.*/
public class Exercicio_Listas06 {
    public static void main(String[] args) {
        ArrayList<String> minhaLista = new ArrayList<>();

        minhaLista.add("Maçã");
        minhaLista.add("Banana");
        minhaLista.add("Cereja");
        minhaLista.add("Uva");
        minhaLista.add("Pêssego");

        for (String fruta : minhaLista)
            if (Objects.equals(fruta, "Pêssego")) {
                System.out.println("A fruta Pêssego está na lista!");
            }
    }
}

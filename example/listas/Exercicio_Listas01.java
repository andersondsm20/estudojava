package org.example.listas;

import java.util.ArrayList;

/* Criando uma lista e adicionando elementos:
Crie um programa Java que declare uma lista (por exemplo, ArrayList)
e adicione os seguintes elementos a ela: "Maçã", "Banana", "Cereja", "Uva".
Em seguida, imprima a lista completa.*/
public class Exercicio_Listas01 {
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
/*------------------------------------------------*/

/*
public class Exercicio_Listas01 {
    public static void main(String[] args) {
        ArrayList<String> minhaLista = new ArrayList<>();

        minhaLista.add("Maçã");
        minhaLista.add("Banana");
        minhaLista.add("Cereja");
        minhaLista.add("Uva");

        System.out.println(minhaLista);
    }
}
*/


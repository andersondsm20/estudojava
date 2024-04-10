package org.example.listas;

import java.util.ArrayList;

public class Exemplo01 {
    public static void main(String[] args) {
        // declara minha lista.
        ArrayList<String> minhaLista = new ArrayList<>();

        // adiciona elementos na minha lista.
        minhaLista.add("Maçã");
        minhaLista.add("Banana");
        minhaLista.add("Pêra");

        // pecorre elementos da minha lista.
        //for (String fruta : minhaLista)
        {
           // System.out.println(fruta);
        }
        // remove elementos da minha lista.
        minhaLista.remove(1);

        System.out.println("Após remover o segundo elemento:");
        //for (String fruta : minhaLista) {
            System.out.println(minhaLista);
        }
    }


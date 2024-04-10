package org.example.listas;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Collections;

/* Ordenando a Lista:
Ordene a lista original de frutas em ordem alfabética e, em seguida, imprima a lista ordenada.*/
public class Exercicio_Listas10 {
    public static void main(String[] args) {
        ArrayList<String> listaFrutas = new ArrayList<>();

        System.out.println();
        System.out.println("#### Lista Desordenada ###");

        listaFrutas.add("Abacaxi");
        listaFrutas.add("Jabuticaba");
        listaFrutas.add("Carambola");
        listaFrutas.add("Banana");
        listaFrutas.add("Graviola");

        for (String frutas : listaFrutas) {
            System.out.println(frutas);
        }

        System.out.println();
        System.out.println("### Lista Ordenada ###");

        Collections.sort(listaFrutas);
        for (String listaOrdenada : listaFrutas) {
            System.out.println(listaOrdenada);
        }
    }
}
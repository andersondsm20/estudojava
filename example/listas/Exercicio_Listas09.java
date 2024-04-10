package org.example.listas;

import java.util.ArrayList;

/*Copiando uma Lista:
Crie uma segunda lista e copie todos os elementos da lista original para a nova lista.
Em seguida, imprima os elementos da nova lista.*/
public class Exercicio_Listas09 {
    public static void main(String[] args) {
        ArrayList<String> ListaOriginal = new ArrayList<>();
        ArrayList<String> ListaCopia = new ArrayList<>();

        ListaOriginal.add("Açai");
        ListaOriginal.add("Camarão");
        ListaOriginal.add("Farinha");

        ListaCopia = ListaOriginal;

        System.out.println(ListaCopia);
    }
}

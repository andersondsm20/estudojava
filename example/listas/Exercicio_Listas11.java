package org.example.listas;

import java.util.ArrayList;

/* Soma de Elementos: Escreva um programa que calcule a soma de todos
os elementos de uma lista de inteiros.*/
public class Exercicio_Listas11 {
    public static void main(String[] args) {
       ArrayList<Integer> lista1 = new ArrayList<>();
       ArrayList<Integer> lista2 = new ArrayList<>();

       lista1.add(2);
       lista1.add(4);
       lista1.add(6);
       lista1.add(8);

       lista2.add(1);
       lista2.add(3);
       lista2.add(5);
       lista2.add(7);

      ArrayList<Integer> listaSoma = new ArrayList<>();
        for (int i = 0; i < lista1.size(); i++) {
            int soma = lista1.get(i) + lista2.get(i);
            listaSoma.add(soma);
        }
        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);
        System.out.println("Soma das Listas: " + listaSoma);
    }
}
package org.example.vetor;

import java.util.Scanner;

// Soma dos elementos
//Escreva um programa que calcule e imprima a soma de todos os elementos de um vetor.
public class ExercicioVetor1 {
    public static void main(String[] args) {
        int vetor[] = new int[5];

        vetor[0] = 50;
        vetor[1] = 100;
        vetor[2] = 200;
        vetor[3] = 250;
        vetor[4] = 300;

        System.out.println("A soma dos vetores é: " + (vetor[0] + vetor[1] + vetor[2] + vetor[3] + vetor[4]));

    }

}

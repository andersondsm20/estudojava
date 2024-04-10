package org.example.vetor;

import java.util.Scanner;

//Vetor invertido
//Desenvolva um programa que inverta a ordem dos elementos em um vetor.
//ordenação
//modificar para que o usuario digite os 5 valores
// e o programa ira imprimir esses valores em ordem crescente
public class ExercicioVetor8 {
    public static void main(String[] args) {
        int vetor[] = new int[5];

        Scanner scanner = new Scanner(System.in);

        vetor[4] = 10;
        vetor[2] = 9;
        vetor[1] = 8;
        vetor[3] = 7;
        vetor[0] = 6;

        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
        System.out.println(vetor[2]);
        System.out.println(vetor[3]);
        System.out.println(vetor[4]);

        scanner.close();
    }
}

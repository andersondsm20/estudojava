package org.example.vetor;

import java.util.Scanner;

//Média dos elementos
//Crie um programa que calcule e imprima a média dos elementos de um vetor.
public class ExercicioVetor2 {
    public static void main(String[] args) {

        int vetor[] = new int[3];

        Scanner scanner = new Scanner(System.in);

        vetor [0] = 10;
        vetor [1] = 7;
        vetor [2] = 9;

        System.out.print("Digite o 1° indice: ");
        int indice1 = scanner.nextInt();

        System.out.print("Digite o 2° indice: ");
        int indice2 = scanner.nextInt();

        System.out.print("Digite o 3° indice: ");
        int indice3 = scanner.nextInt();

        System.out.print("A média dos vetores é: " + (vetor[indice1] + vetor[indice2] + vetor[indice3]) / 3);

        scanner.close();
    }
}

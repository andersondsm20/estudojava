package org.example.vetor;

import java.util.Scanner;

//Menor elemento
//Desenvolva um programa que encontre e imprima o menor elemento de um vetor.

//modificar esse programa para que o usuario digite 5 valores e o programe que vai encontrar
//o menor valor
public class ExercicioVetor4 {
    public static void main(String[] args) {

        int vetor [] = new int[5];

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do 1° vetor: ");
        vetor[0] = scanner.nextInt();

        System.out.print("Digite o valor do 2° vetor: ");
        vetor[1] = scanner.nextInt();

        System.out.print("Digite o valor do 3° vetor: ");
        vetor[2] = scanner.nextInt();

        System.out.print("Digite o valor do 4° vetor: ");
        vetor[3] = scanner.nextInt();

        System.out.print("Digite o valor do 5° vetor: ");
        vetor[4] = scanner.nextInt();

        if (vetor[0] < vetor[1] && vetor[0] < vetor[2] && vetor[0] < vetor[3] && vetor[0] < vetor[4]) {
            System.out.println("O menor valor do vetor é: " + vetor[0]);

        } else if (vetor[1] < vetor[0] && vetor[1] < vetor[2] && vetor[1] < vetor[3] && vetor[1] < vetor[4]) {
            System.out.println(" O menor valor do vetor é: " + vetor[1]);

        } else if (vetor[2] < vetor[0] && vetor[2] < vetor[1] && vetor[2] < vetor[3] && vetor[2] < vetor[4]) {
            System.out.println("O menor valor do vetor é: " + vetor[2]);

        } else if (vetor[3] < vetor[0] && vetor[3] < vetor[1] && vetor[3] < vetor[2] && vetor[3] < vetor[4]) {
            System.out.println("O menor valor do vetor é: " + vetor[3]);

        } else if (vetor[4] < vetor[0] && vetor[4] < vetor[1] && vetor[4] < vetor[2] && vetor[4] < vetor[3]) {
            System.out.println("O menor valor do vetor é: " + vetor[4]);
        }
            scanner.close();
    }
}

//vetor[0] = 100;
//vetor[1] = 150;
// vetor[2] = 200;
//  vetor[3] = 250;
//  vetor[4] = 300;

// System.out.println("Os valores do vetor são: {100, 150, 200, 250, 300}");
//System.out.println("O menor valor do vetor é: " + vetor[0]);
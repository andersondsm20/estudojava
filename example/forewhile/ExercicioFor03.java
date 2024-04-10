package org.example.forewhile;

import java.util.Scanner;

//Maior elemento
//Faça um programa que o usuario digite 5 numeros e o programa deve retornar o maior deles.
public class ExercicioFor03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vetor[] = new int[5];

        System.out.print("Digite o 1° numero: ");
        vetor[0] = scanner.nextInt();

        System.out.print("Digite o 2° numero: ");
        vetor[1] = scanner.nextInt();

        System.out.print("Digite o 3° numero: ");
        vetor[2] = scanner.nextInt();

        System.out.print("Digite o 4° numero: ");
        vetor[3] = scanner.nextInt();

        System.out.print("Digite o 5° numero: ");
        vetor[4] = scanner.nextInt();

        int maior = 0;
        for (int indice = 0; indice < 5; indice++) {
            if (vetor[indice] > maior) {
                maior = vetor[indice];
            }
        }
        System.out.println();
        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}

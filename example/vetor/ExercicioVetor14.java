
package org.example.vetor;

import java.util.Scanner;

//Escreva um programa que encontre os números pares em um vetor de inteiros.
public class ExercicioVetor14 {
    public static void main(String[] args) {
        int vetor[] = new int[6];

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número: ");
        vetor[0] = scanner.nextInt();

        System.out.print("Digite o número: ");
        vetor[1] = scanner.nextInt();

        System.out.print("Digite o número: ");
        vetor[2] = scanner.nextInt();

        System.out.print("Digite o número: ");
        vetor[3] = scanner.nextInt();

        System.out.print("Digite o número: ");
        vetor[4] = scanner.nextInt();

        System.out.print("Digite o número: ");
        vetor[5] = scanner.nextInt();

        if (vetor[0] % 2 == 0) {
            System.out.println("Número par");

        } if (vetor[1] % 2 == 0) {
            System.out.println("Numero par");

        }  if (vetor[2] % 2 == 0) {
            System.out.println("Numero par");

        }  if (vetor[3] % 2 == 0) {
            System.out.println("Numero par");

        }  if (vetor[4] % 2 == 0) {
            System.out.println("Número par");

        }  if (vetor[5] % 2 == 0) {
            System.out.println("Número par");
        }
    }
}
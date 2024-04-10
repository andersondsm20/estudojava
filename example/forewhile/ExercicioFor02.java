package org.example.forewhile;

import java.util.Scanner;

//Média dos elementos
//Crie um programa que calcule e imprima a média dos elementos de um vetor.
public class ExercicioFor02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vetor[] = new int[3];
        double media = 0;

        System.out.print("Digite a 1° nota: ");
        vetor[0] = scanner.nextInt();

        System.out.print("Digite a 2° nota: ");
        vetor[1] = scanner.nextInt();

        System.out.print("Digite a 3° nota: ");
        vetor[2] = scanner.nextInt();

        for (int indice = 0; indice < vetor.length; indice++) {
            media += vetor[indice];
        }
        media = media / vetor.length;

        System.out.println("A média das notas é: " + media);

        scanner.close();
    }
}

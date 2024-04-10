package org.example.vetor;

import java.util.Scanner;

//Busca: Escreva um programa que solicite um valor ao usuário
//e verifique se esse valor está presente no vetor.
public class ExercicioVetor5 {
    public static void main(String[] args) {
        int vetor[] = new int[5];

        Scanner scanner = new Scanner(System.in);

        vetor[0] = 10;
        vetor[1] = 15;
        vetor[2] = 25;
        vetor[3] = 35;
        vetor[4] = 45;

        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();

        if (valor == vetor[0] || valor == vetor[1] || valor == vetor[2] || valor == vetor[3] || valor == vetor[4]) {
            System.out.println("Esse valor está presente no vetor");

        } else {
            System.out.println("Esse valor não está presente no vetor!");
        }
        scanner.close();
    }

}


package org.example.forewhile;

import java.util.Scanner;

//Busca: Escreva um programa que solicite um valor ao usuário
//e verifique se esse valor está presente no vetor.
public class ExercicioWhile05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vetor[] = {100, 150, 200, 250, 300};

        System.out.print("Digite um valor de 100 até 300: ");
        int busca = scanner.nextInt();


        int i = 0;
        while (i < 5) {
            if (vetor[i] == busca) {
                i++;
                System.out.println("Esse valor está presente no vetor!");
            } else {
                System.out.println("Não esta presente no vetor!");
            }
            scanner.close();
        }

    }
}

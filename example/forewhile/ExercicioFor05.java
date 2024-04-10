package org.example.forewhile;

import java.util.Scanner;

//Busca: Escreva um programa que solicite um valor ao usuário
//e verifique se esse valor está presente no vetor.
public class ExercicioFor05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vetor[] = {20, 40, 60, 80, 100};

        System.out.print("Digite um número: ");
        int busca = scanner.nextInt();

        boolean encontrado = false;

        for (int indice = 0; indice < vetor.length; indice++) {
            if (vetor[indice] == busca) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Está presente no vetor!");
        } else {
            System.out.println("Não está presente no vetor!");
        }
        scanner.close();
    }
}

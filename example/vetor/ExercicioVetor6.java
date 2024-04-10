package org.example.vetor;

import java.util.Scanner;

//Contagem de ocorrências
//Crie um programa que conte quantas vezes um valor específico ocorre em um vetor.

// modifique esse programa, para que os 6 valores sejam inseridos pelo usuario;
// um outro valor também será informado pelo usuario;
//o programa deve informar quantas vezes esse ultimo valor digitado se repete no vetor.

public class ExercicioVetor6 {
    public static void main(String[] args) {
        int vetor[] = new int[6];
        int valorRepetido;
        int contador = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        vetor[0] = scanner.nextInt();

        System.out.print("Digite um valor: ");
        vetor[1] = scanner.nextInt();

        System.out.print("Digite um valor: ");
        vetor[2] = scanner.nextInt();

        System.out.print("Digite um valor: ");
        vetor[3] = scanner.nextInt();

        System.out.print("Digite um valor: ");
        vetor[4] = scanner.nextInt();

        System.out.print("Digite um valor: ");
        vetor[5] = scanner.nextInt();

        System.out.print("Digite um valor aleatorio: ");
        valorRepetido = scanner.nextInt();

        if (valorRepetido == vetor[0]) {
            contador++;

        } if (valorRepetido == vetor[1]) {
            contador++;

        }  if (valorRepetido == vetor[2]) {
            contador++;

        }  if (valorRepetido == vetor[3]) {
            contador++;

        }  if (valorRepetido == vetor[4]) {
            contador++;

        }  if (valorRepetido == vetor[5]) {
            contador++;
        }
        System.out.println("O valor " + valorRepetido + " se repete "  + contador +  " vezes no vetor.");
        scanner.close();
    }
}
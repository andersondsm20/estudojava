package org.example.vetor;

import java.util.Scanner;

//Maior elemento
//Faça um programa que o usuario digite 5 numeros e o programa deve retornar o maior deles.
public class ExercicioVetor3 {
    public static void main(String[] args) {
        int vetor [] = { 20, 40, 60, 80, 100};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um indice: ");
        int indice = scanner.nextInt();

        if(indice == 0) {
            System.out.print("Esse não é o maior elemento do vetor: " + vetor[indice]);

        } else if (indice == 1) {
            System.out.print("Esse não é o maior elemento do vetor: " + vetor[indice]);

        } else if (indice == 2) {
            System.out.print("Esse não é o maior elemento do vetor: " + vetor[indice]);

        } else if (indice == 3) {
            System.out.print("Esse não é o maior elemento do vetor: " + vetor[indice]);

        } else if (indice == 4) {
            System.out.print("Esse é o maior elemento do vetor: " + vetor[indice]);
        }
        scanner.close();
    }

}

package org.example.estruturadedecisaoif;

import java.util.Scanner;

//Escreva um programa que solicite dois números inteiros ao usuário
// e determine qual deles é o maior.
// Em seguida, exiba uma mensagem indicando qual número é o maior.
public class ExercicioIf1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int umNumero = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int doisNumero = scanner.nextInt();

        if (umNumero > doisNumero) {
            System.out.println(" O número " + umNumero + " e maior!");

        } else if (umNumero < doisNumero) {
            System.out.println( " O número " + umNumero + " é menor!");
        }

    }
}

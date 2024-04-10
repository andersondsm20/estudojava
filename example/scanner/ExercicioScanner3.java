package org.example.scanner;

//Verificar se um número é par ou ímpar:
//Leia um número inteiro e verifique se ele é par ou ímpar.

import java.util.Scanner;

public class ExercicioScanner3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2  == 0) {
            System.out.println("O número digitado é par!");

        } else {
            System.out.println("O número digitado é impar!");

        scanner.close();
        }
    }
}

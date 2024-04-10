package org.example.revisaofor;

import java.util.Scanner;

/*Tabuada: Crie um programa que imprima a tabuada de um número específico
fornecido pelo usuário usando um loop for.*/
public class RevisaoFor7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        for (int b = 1; b <= numero; b++) {
            System.out.println( b + " x " + numero + " = " + (b * numero));
        }
    }
}
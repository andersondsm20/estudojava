package org.example.revisaowhile;

import java.util.Scanner;

/* Tabela de multiplicação: Crie um programa que exiba a tabela de multiplicação
de um número fornecido pelo usuário usando um loop while.*/
public class RevisaoWhile4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int contador = 1;
        while (contador <= numero) {
            System.out.println(contador + " * " + numero + " = " + (contador * numero));
            contador++;
        }
    }
}

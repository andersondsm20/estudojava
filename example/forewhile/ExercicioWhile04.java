package org.example.forewhile;

import java.util.Scanner;

//Menor Elemento
//modificar esse programa para que o usuario digite 5 valores e o programe que vai encontrar
//o menor valor
public class ExercicioWhile04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vetor[] = new int[5];

        System.out.print("Digite o 1° valor: ");
        vetor[0] = scanner.nextInt();

        System.out.print("Digite o 2° valor: ");
        vetor[1] = scanner.nextInt();

        System.out.print("Digite o 3° valor: ");
        vetor[2] = scanner.nextInt();

        System.out.print("Digite o 4° valor: ");
        vetor[3] = scanner.nextInt();

        System.out.print("Digite o 5° valor: ");
        vetor[4] = scanner.nextInt();

        int menor = vetor[0];

        int i = 0;
        while (i < 5) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
            i++;
        }

        System.out.println();
        System.out.println("O menor valor é: " + menor);

        scanner.close();
    }
}
package org.example.forewhile;

import java.util.Scanner;

//Maior elemento
//Faça um programa que o usuario digite 5 numeros e o programa deve retornar o maior deles.
public class ExercicioWhile03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor[] = new int[5];
        int maior = 0;

        System.out.print("Digite o 1° número: ");
        vetor[0] = scanner.nextInt();

        System.out.print("Digite o 2° número: ");
        vetor[1] = scanner.nextInt();

        System.out.print("Digite o 3° número: ");
        vetor[2] = scanner.nextInt();

        System.out.print("Digite o 3° número: ");
        vetor[3] = scanner.nextInt();

        System.out.print("Digite o 4° número: ");
        vetor[4] = scanner.nextInt();

        int i = 0;
        while (i < 5) {
          if (vetor[i] > maior) {
              maior = vetor[i];
          }
            i++;
        }
        System.out.println("");

        System.out.println("O maior valor é: " + maior);

        scanner.close();
    }

}

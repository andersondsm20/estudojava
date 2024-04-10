package org.example.forewhile;

import java.util.Scanner;

public class ExercicioFor09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero de linhas: ");
        int numeroLinhas = scanner.nextInt();
        scanner.close();

        for (int altura = 1; altura <= numeroLinhas; altura++) {
            for (int espacoBranco = 1; espacoBranco < altura; espacoBranco++) {
                System.out.print(" ");
            }
            for (int asteristicos = altura; asteristicos <= numeroLinhas; asteristicos++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/* *****
    ****
     ***
      **
       *
usuario digita o tamanho da piramide */
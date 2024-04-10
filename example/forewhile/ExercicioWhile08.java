package org.example.forewhile;

import java.util.Scanner;

public class ExercicioWhile08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de filas: ");
        int numerofilas = scanner.nextInt();
        scanner.close();

        int altura = numerofilas;
        while (altura >= 1) {
            int asteristicos = 1;
            while (asteristicos <= altura) {
                System.out.print("*");
                asteristicos++;
            }
            System.out.println();
            altura--;
        }
    }
}

/* Resolução

*****
****
***
**
*

 Fim */
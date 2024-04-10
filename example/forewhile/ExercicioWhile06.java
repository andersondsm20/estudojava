package org.example.forewhile;

import java.util.Scanner;
public class ExercicioWhile06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero de filas: ");
        int numeroFilas = scanner.nextInt();
        scanner.close();

        int asteristicos = 1;
        while (asteristicos <= numeroFilas) {
            int altura = 1;
            while (altura <= asteristicos) {
                System.out.print("*");
                altura++;
            }
            System.out.println();
            asteristicos++;
        }
    }
}

/* Resolução

*
**
***
****
*****

Fim */
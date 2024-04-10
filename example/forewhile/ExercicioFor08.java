package org.example.forewhile;

import java.util.Scanner;

public class ExercicioFor08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero de filas: ");
        int numeroFilas = scanner.nextInt();
        scanner.close();

        for (int altura = numeroFilas; altura >= 1; altura--) {
            for (int asteristicos = 1; asteristicos <= (altura + 1) - 1; asteristicos++) {
                System.out.print("*");
            }
           // for (int espacoBranco = 1; espacoBranco <= numeroFilas; espacoBranco++) {
             //   System.out.print(" ");
           // }
            System.out.println();
        }
    }
}

/* Resolução: Usuario digita o tamanho.

 *****
 ****
 ***
 **
 *

 Fim **/
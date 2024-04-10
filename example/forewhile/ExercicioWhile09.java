package org.example.forewhile;

import java.util.Scanner;
public class ExercicioWhile09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de filas: ");
        int numeroFilas = scanner.nextInt();
        scanner.close();

        int altura = numeroFilas;
        while (altura >= 1) {
            int espacoBranco = numeroFilas - altura;
            while (espacoBranco > 0) {
                System.out.print(" ");
                espacoBranco--;
            }
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
/* *****
    ****
     ***
      **
       *
Fim */

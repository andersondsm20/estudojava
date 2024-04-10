package org.example.forewhile;

import java.util.Scanner;

public class ExercicioWhile07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de filas: ");
        int numeroFilas = scanner.nextInt();
        scanner.close();

        int altura = 0;
        while (altura <= numeroFilas) {
            int espacoBranco = 1;
            while (espacoBranco <= numeroFilas - altura) {
                System.out.print(" ");
                espacoBranco++;
            }
            int asteristico = 1;
            while (asteristico <= altura) {
                System.out.print("*");
                asteristico++;
            }
            System.out.println("#");
            altura++;
        }
    }
}
/* Resolução
       *
      **
     ***
    ****
   *****
Fim*/
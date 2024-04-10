package org.example.forewhile;

import java.util.Scanner;

public class ExercicioFor07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de filas: ");
        int numeroFilas = scanner.nextInt();
        scanner.close();

        for (int altura = 0; altura <= numeroFilas; altura++) {

            for (int espacoBranco = 1; espacoBranco <= numeroFilas - altura; espacoBranco++) {
                System.out.print(" ");
            }
            for (int asteristicos = 1; asteristicos <= altura; asteristicos++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
       *
      **
     ***
    ****
   *****
usuario digita a quantidade da piramide.


  public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        String vetor[] = new String[5];

        vetor[0] = "    *";
        vetor[1] = "   **";
        vetor[2] = "  ***";
        vetor[3] = " ****";
        vetor[4] = "*****";

        System.out.print("Digite um número: ");
        int numeroFilas = scanner.nextInt();

        for (int indice = 0; indice <= 5; indice++) {
            if (vetor.length > numeroFilas) {
           }
            System.out.println(vetor[indice]);
        }
        scanner.close();
    } */
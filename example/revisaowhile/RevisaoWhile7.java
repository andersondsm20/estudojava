package org.example.revisaowhile;

import java.util.Scanner;

public class RevisaoWhile7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();
        scanner.close();

        int cont = 1;

        int altura = 1;
        while (altura <= numero) {

            int espaco = numero - cont;
            while (espaco > 0) {
                System.out.print(" ");
                espaco--;
            }
                cont++;
            int asteriscos = 1;
            while (asteriscos <= altura)  {
                System.out.print("*");
                asteriscos++;
            }
                altura++;
            System.out.println();
        }
    }
}
/* Resolução
       *
      **
     ***
    ****
   *****
 */
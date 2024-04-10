package org.example.revisaowhile;

import java.util.Scanner;

public class RevisaoWhile9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();


        int altura = 0;
        while (altura <= numero) {

            int espaco = 0;
            while (espaco <= altura - 1) {
                System.out.print(" ");
                espaco++;
            }

            int asteriscos = numero;
            while (asteriscos > altura) {
                System.out.print("*");
                asteriscos--;
            }

            altura++;
            System.out.println();
        }
    }
}

/* asteriscos repetidos/espaços a esquerda/ ordem decrescente
*****
 ****
  ***
   **
    *
*/
package org.example.revisaowhile;

import java.util.Scanner;

public class RevisaoWhile8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        int altura = 0;
        while (altura <= numero) {
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
/* Resolução / ordem decrescente / asteriscos se repete / altura igual a quantidade de numero.
*****
****
***
**
*
 Fim */
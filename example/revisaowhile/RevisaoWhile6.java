package org.example.revisaowhile;

import java.util.Scanner;

public class RevisaoWhile6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();
        scanner.close();

        int asteriscos = 1;
        while (asteriscos <= numero) {
            int altura = 1;
            while (altura <= asteriscos) {
                System.out.print("*");
                altura++;
            }
            asteriscos++;
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
 */
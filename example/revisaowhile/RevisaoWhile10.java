package org.example.revisaowhile;

import java.util.Scanner;

public class RevisaoWhile10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        int altura = 1;
        int asteriscos = 1;
        while (altura <= (numero + 1) / 2) {

            int espaco = ((numero - 1) / 2);
            while (espaco >= altura) {
                System.out.print(" ");
                espaco--;
            }
            int cont = 1;
            while (cont <= asteriscos) {
                System.out.print("*");
                cont++;
            }
                asteriscos += 2;
                altura++;
                System.out.println();
        }
    }
}
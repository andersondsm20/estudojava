package org.example.forewhile;

import java.util.Random;
import java.util.Scanner;

public class InterandoComOLacoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("=============================================");

        int numeroAleatorio = random.nextInt(10);
        boolean tentarNovamente = true;

        System.out.println("Aperte CTRL+C, a qualquer momento, para encerrar.");

        while (tentarNovamente) {
            System.out.print("Tente adivinhar o número: ");
            int numero = scanner.nextInt();

            tentarNovamente = numeroAleatorio != numero;

            if (tentarNovamente) {
                System.out.println("Errado");
            }
        }
        System.out.println("Parabéns! Você advinhou. Era o número " + numeroAleatorio + " mesmo.");

        System.out.println("Fim");
        System.out.println("==============================================");
    }
}

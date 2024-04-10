package org.example.scanner;

//Calcular a média de três números:
// Peça ao usuário para inserir três números e calcule a média aritmética.

import java.util.Scanner;

public class ExercicioScanner1 {

    public static void main(String[] args) {
        System.out.println("======== CALCULO MÉDIA ========");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double primeiroNumero = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double segundoNumero = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double terceiroNumero = scanner.nextDouble();

        System.out.println("A Média Aritmética é: " + (primeiroNumero + segundoNumero + terceiroNumero) / 3);
        }
    }
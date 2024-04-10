package org.example.scanner;

//Calculadora Simples:
//Crie uma calculadora simples que peça ao usuário para inserir dois números
// e uma operação (adição, subtração, multiplicação ou divisão)
// e exiba o resultado.

import java.util.Scanner;

public class ExercicioScanner2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("====== CALCULADORA SIMPLES ======");

        System.out.print("Digite o primeiro número: ");
        double primeiroNumero = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double segundoNumero = scanner.nextDouble();

        System.out.println();

        System.out.println("Escolha a operação" +
                "\n" + "1 - Soma" +
                "\n" + "2 - Divisão" +
                "\n" + "3 - Multiplicação" +
                "\n" + "4 - Subtração");
        System.out.println();
        int numeroOperacao = scanner.nextInt();

        //Posso usar essas variaveis também, mais optei por inserir os valores no codigo.
        //double soma = primeiroNumero + segundoNumero;
        //double divisao = primeiroNumero / segundoNumero;
        //double multiplicacao = primeiroNumero * segundoNumero;
        //double subtracao = primeiroNumero - segundoNumero;

        System.out.println();

        if (numeroOperacao == 1) {
            System.out.println("O valor da soma dos numeros e igual: " + (primeiroNumero + segundoNumero));

        } else if (numeroOperacao == 2) {
            System.out.println("O valor da divisão dos numeros e igual: " + (primeiroNumero / segundoNumero));

        } else if (numeroOperacao == 3) {
            System.out.println("O valor da divisão dos numeros e igual: " + primeiroNumero * segundoNumero);

        } else if (numeroOperacao == 4) {
            System.out.println(" O valor da subtração dos numeros e igual: " + (primeiroNumero - segundoNumero));

        } else {
            System.out.println("Operação Invalida!!");

            scanner.close();
        }
    }
}
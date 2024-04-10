package org.example.operadores;

import java.util.Scanner;

//Cálculo de Desconto: Crie um programa que calcule o valor final de um produto
// após aplicar um desconto. O programa deve solicitar o preço original do produto
// e a porcentagem de desconto a ser aplicada.
public class ExercicioOperadoresAritmeticos1 {
    public static void main(String[] args) {
        System.out.println("=================== CÁLCULO DE DESCONTO ==================");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco_inicial = scanner.nextDouble();

        System.out.print("Digite o percentual do desconto: ");
        double percdesconto = scanner.nextDouble();

        double desconto = preco_inicial * (percdesconto/100);

        double preco_final = preco_inicial - desconto;

        System.out.println("O preço do produto é R$ " + preco_inicial);
        System.out.println("O valor do desconto é R$ " + desconto);
        System.out.println("O valor final do produto é R$ " + (preco_final));

        scanner.close();
    }
}

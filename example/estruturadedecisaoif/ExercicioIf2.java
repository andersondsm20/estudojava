package org.example.estruturadedecisaoif;

import java.util.Scanner;
public class ExercicioIf2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do produto 01: ");
        double produto_01 = scanner.nextDouble();

        System.out.print("Digite o preço do produto 02: ");
        double produto_02 = scanner.nextDouble();

        System.out.print("Digite o preço do produto 03: ");
        double produto_03 = scanner.nextDouble();

        if ((produto_01 < produto_02) && (produto_01 < produto_03)) {
            System.out.println("Você deve comprar o Produto 01");

        } else if ((produto_02 < produto_01) && (produto_02 < produto_03)) {
            System.out.println("Você deve comprar o produto 02");

        } else if ((produto_03 < produto_01) && (produto_03 < produto_02)) {
            System.out.println("Você deve comprar o produto 03 ");

        }
        scanner.close();
    }
}

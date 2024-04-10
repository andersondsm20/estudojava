package org.example.vetor;

public class Vetores {
    public static void main(String[] args) {
        System.out.println("================================================");

        double[] precoProdutos = new double[] { 150.0, 20.0, 10,0, 100.0};
        double precoProduto =  precoProdutos[1];

        System.out.println("O preço do segundo produto é " + precoProduto);
        precoProdutos[1] = 21.0;

        System.out.println("O segundo produto teve seu preço alterado.");
        System.out.println("O preço do segundo produto é " + precoProdutos[1]);

        System.out.println("Fim!");
        System.out.println("=================================================");

    }
}

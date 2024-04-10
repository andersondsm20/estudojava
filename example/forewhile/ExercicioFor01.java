package org.example.forewhile;

//Soma dos elementos:
//Escreva um programa que calcule e imprima a soma de todos os elementos de um vetor.
public class ExercicioFor01 {
    public static void main(String[] args) {
    int vetor[] = { 5, 15, 25, 35, 45 };
    int tamanho = vetor.length;
    int soma = 0;

    for (int indice = 0; indice < tamanho; indice++) {
        soma += vetor[indice];
    }
        System.out.println("A soma dos elementos do vetor é: " + soma);
    }
}

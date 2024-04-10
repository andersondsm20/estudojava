package org.example.forewhile;

//Soma dos elementos:
//Escreva um programa que calcule e imprima a soma de todos os elementos de um vetor.
public class ExercicioWhile01 {
    public static void main(String[] args) {
        int vetor[] = {10, 20, 40, 60, 80};
        int tamanho = vetor.length;
        int soma = 0;
        int indice = 0;

        while (indice < tamanho) {
            soma += vetor[indice];
            indice++;
        }
        System.out.println("A soma dos elementos do vetor é: " + soma);
    }
}

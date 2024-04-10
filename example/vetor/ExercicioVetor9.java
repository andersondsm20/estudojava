package org.example.vetor;

//Cópia de vetores
//Escreva um programa que copie os elementos de um vetor para outro vetor.
public class ExercicioVetor9 {
    public static void main(String[] args) {
        int vetorA[] = new int[5];
        int vetorB[] = new int[5];

        vetorA[0] = 200;
        vetorA[1] = 250;
        vetorA[2] = 300;
        vetorA[3] = 350;
        vetorA[4] = 400;

        vetorB = vetorA;

        System.out.println(vetorB[0]);
        System.out.println(vetorB[1]);
        System.out.println(vetorB[2]);
    }

}

package org.example.vetor;

import java.util.Arrays;
import java.util.Scanner;

//Concatenação de vetores
//Crie um programa que combine dois vetores em um terceiro vetor.
public class ExercicioVetor10 {
    public static void main(String[] args) {
        int vetorA[] = {1, 2, 3};
        int vetorB[] = {4, 5, 6};
        int vetorC[] = new int[6];

        vetorC[0] = vetorA[0];
        vetorC[1] = vetorA[1];
        vetorC[2] = vetorA[2];
        vetorC[3] = vetorB[0];
        vetorC[4] = vetorB[1];
        vetorC[5] = vetorB[2];

        System.out.println("VetorC[]: " + Arrays.toString(vetorC));
    }
}


//int vetorA[] = new int[5];
//int vetorB[] = new int[5];
// int vetorC[] = new int[10];


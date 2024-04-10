package org.example.vetor;

import java.util.Arrays;

//Soma de dois vetores: Implemente um programa que some dois vetores elemento a elemento;
// armazenando o resultado em um terceiro vetor.
public class ExercicioVetor13 {
    public static void main(String[] args) {
        int vetorA[] = {1, 2, 3, 4};
        int vetorB[] = {5, 6, 7, 8};
        int vetorC[] = new int[4];

        vetorC[0] = vetorA[0] + vetorB[0];
        vetorC[1] = vetorA[1] + vetorB[1];
        vetorC[2] = vetorA[2] + vetorB[2];
        vetorC[3] = vetorA[3] + vetorB[3];

        System.out.println("VetorC[]: " + Arrays.toString(vetorC));
    }
}
//poderia ser usado assim, mais adotei o metodo do vetorC receber a somar do vetorA+vetorB.
//Arrays.setAll(vetorC, i -> vetorA[i] + vetorB[i]);
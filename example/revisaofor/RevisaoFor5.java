package org.example.revisaofor;

/*
Soma de números pares:
Escreva um programa que calcule a soma de todos os números pares de 1 a 100 usando um loop for.*/
public class RevisaoFor5 {
    public static void main(String[] args) {
        for (int p = 1; p <= 100; p++) {
            if (p % 2 == 0) {
                System.out.println(p);
            }
        }
    }
}

package org.example.revisaowhile;

/* Contagem regressiva:
Escreva um programa que conte regressivamente de 10 a 1 usando um loop while.*/
public class RevisaoWhile1 {
    public static void main(String[] args) {

        int contador = 10;
        while (contador >= 1) {
            System.out.println(contador--);
            contador--;
        }
    }
}

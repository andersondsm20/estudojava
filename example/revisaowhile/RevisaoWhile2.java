package org.example.revisaowhile;

/* Soma dos números pares: Crie um programa que calcule a soma dos números
pares de 1 a 10 usando um loop while. */
public class RevisaoWhile2 {
    public static void main(String[] args) {

        int contador = 1;
        while (contador <= 10) {
            if (contador % 2 == 0)
                System.out.println(contador);
            contador++;
        }
    }
}
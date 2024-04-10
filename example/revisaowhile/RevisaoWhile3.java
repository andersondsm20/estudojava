package org.example.revisaowhile;

import java.util.Scanner;

/*
Entrada do usuário: Peça ao usuário para digitar um número
e use um loop while para exibir todos os números de 1 até o número digitado.*/
public class RevisaoWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numeroDigitado = scanner.nextInt();

        int contador = 1;
        while (contador <= numeroDigitado) {
            System.out.println(contador);
            contador++;
        }
    }
}

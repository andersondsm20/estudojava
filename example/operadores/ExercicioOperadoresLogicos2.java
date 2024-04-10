package org.example.operadores;
import java.util.Scanner;

//Validação de Números em um Intervalo: Peça ao usuário para digitar um número e verifique
// se ele está dentro de um intervalo específico (por exemplo, entre 1 e 100).
public class ExercicioOperadoresLogicos2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if ((numero >= 1 ) && (numero <= 100)) {
            System.out.println("O numero esta no intervalo! ");

            scanner.close();
        }
    }
}

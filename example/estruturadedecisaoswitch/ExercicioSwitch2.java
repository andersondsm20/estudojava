package org.example.estruturadedecisaoswitch;

import java.util.Scanner;

public class ExercicioSwitch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Óla essas são nossas opção:" +
                            "\n" + "1 = Setor de vendas" +
                            "\n" + "2 = Reclamações" +
                            "\n" + "3 = Recarga" +
                            "\n" + "4 = Internet");
        System.out.print("Escolha uma opção para continuarmos o atendimento: ");

        int escolhaNumero = scanner.nextInt();

        switch (escolhaNumero) {
            case 1: escolhaNumero = 1;
                System.out.println("Seja Bem vindo(a) ao nosso setor de venda!");
                break;

            case 2: escolhaNumero = 2;
                System.out.println("Seja Bem vindo(a) ao nosso setor de Reclamações!");
                break;

            case 3: escolhaNumero = 3;
                System.out.println("Seja Bem vindo(a) ao nosso setor de Recarga!");
                break;

            case 4: escolhaNumero = 4;
                System.out.println("Seja Bem vindo(a) ao nosso setor de Internet!");
                break;

            default: escolhaNumero = 5;
                System.out.println("Opção invalida!");
        }
        scanner.close();
    }
}

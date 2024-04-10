package org.example.enun;

import java.util.Scanner;

import static org.example.enun.Exercicio_Enum1.DiaDaSemana.DOMINGO;

/* Dias da Semana: Crie um enum chamado DiaDaSemana com as constantes
DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO.
Em seguida, escreva um programa que recebe o dia da semana como entrada e imprime
se é um dia útil ou um fim de semana.*/
public class Exercicio_Enum1 {
    enum DiaDaSemana {
        DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO,
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");
        String diaDigitado = scanner.nextLine().toUpperCase();

        DiaDaSemana dia = DiaDaSemana.valueOf(diaDigitado);

        if (dia == DiaDaSemana.SABADO || dia == DiaDaSemana.DOMINGO) {
            System.out.println("Fim de semana!");

        } else if (dia == DiaDaSemana.SEGUNDA || dia == DiaDaSemana.TERCA ||
                   dia == DiaDaSemana.QUARTA || dia == DiaDaSemana.QUINTA ||
                   dia == DiaDaSemana.SEXTA) {
            System.out.println("Dia útil");
        } else {
            System.out.println("Dia Inválido");
        }
        scanner.close();
    }
}
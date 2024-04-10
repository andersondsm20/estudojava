package org.example.variaveleconstante;

//Exercício 1: Soma de Dois Números
//Escreva um programa que declare duas variáveis inteiras,
//atribua valores a elas e calcule a soma desses dois números.
//Em seguida, exiba o resultado da soma na tela.

import javax.swing.*;

public class Exer1VariaveisConstantes {

    public static void main(String[] args) {

        int valor1 = 20;
        int valor2 = 10;
        int soma = valor1 + valor2;

        JOptionPane.showMessageDialog(null,"A soma entre " + valor1 + " + "  +  valor2 + " e igual a " + soma + ".");
        JOptionPane.showMessageDialog(null,"A multiplicação entre " + valor1 + " * " + valor2 + " e igual a " + valor1 * valor2 + ".");
        JOptionPane.showMessageDialog(null,"A divisão entre " + valor1 + " / " + valor2 + " e igual a " + valor1 / valor2 + ".");
        JOptionPane.showMessageDialog(null,"A subtração entre " + valor1 + " - " + valor2 + " e igual a " + (valor1 - valor2) + ".");
    }
}

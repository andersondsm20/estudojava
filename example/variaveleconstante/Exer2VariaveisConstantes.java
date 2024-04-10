package org.example.variaveleconstante;

//Exercício 2: Cálculo da Média
//Escreva um programa que declare três variáveis inteiras,
//atribua valores a elas representando notas, e calcule a média dessas notas.
//Em seguida, exiba o resultado da média na tela.

import javax.swing.*;

public class Exer2VariaveisConstantes {

    public static void main(String[] args) {

        int nota1;
        int nota2;
        int nota3;

       nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota: "));
       nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota: "));
       nota3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a terceira nota: "));

       JOptionPane.showMessageDialog(null,"Sua Média é " + (nota1 + nota2 + nota3) / 3 + ".");
    }
}

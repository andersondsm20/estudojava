package org.example.variaveleconstante;

// criar um programa que faça com que o usuario ao digitar o dia da semana, possa vizualizar
// o cardapio semanal!

import javax.swing.*;

public class Exer3VariaveisConstantes {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Bem vindo ao nosso Cardapio Semanal!");
        String segunda = "Açai x Camarão";
        String terca = "Carne Assada de Panela";
        String quarta = "Peixe Frito";
        String quinta = "Vatapá";
        String sexta = "Maniçoba";
        String sabado = "Frango Frito";
        String diaDaSemana = JOptionPane.showInputDialog("Digite o dia da semana: " );

        if (diaDaSemana.equalsIgnoreCase("segunda")) {

            JOptionPane.showMessageDialog(null, "O cardapio de hoje é: " + segunda);

        } else if (diaDaSemana.equalsIgnoreCase("terca")) {

            JOptionPane.showMessageDialog( null,"O cardapio de hoje é: " + terca);

        } else if (diaDaSemana.equalsIgnoreCase("quarta")) {

            JOptionPane.showMessageDialog(null, "O cardapio de hoje é: " + quarta);

        } else if (diaDaSemana.equalsIgnoreCase("quinta")) {

            JOptionPane.showMessageDialog(null, "O cardapio de hoje é: " + quinta);

        } else if (diaDaSemana.equalsIgnoreCase("sexta")) {

            JOptionPane.showMessageDialog(null, "O cardapio de hoje é: " + sexta);

        } else if (diaDaSemana.equalsIgnoreCase("sabado")) {

            JOptionPane.showMessageDialog(null, "O cardapio de hoje é: " + sabado);

        } else {

            JOptionPane.showMessageDialog(null,"Dia da Semana Invalido");
        }
    }
}










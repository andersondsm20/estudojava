package org.example.estruturadedecisaoswitch;

public class EstruturaDeDecisaoSwitch2 {
    public static void main(String[] args) {

        String nomeDoDiaDaSemana = "";

        switch (5) {
            case 1: nomeDoDiaDaSemana = "Domingo";
                break;
            case 2: nomeDoDiaDaSemana = "Segunda-feira";
                break;
            case 3: nomeDoDiaDaSemana = "Quarta-feira";
                break;
            case 4: nomeDoDiaDaSemana = "Quinta-feira";
                break;
            case 5: nomeDoDiaDaSemana = "Sexta-feira";
                break;
            case 6: nomeDoDiaDaSemana = "Sábado";
                break;
            case 7: nomeDoDiaDaSemana = "Domingo";
                break;
            default: nomeDoDiaDaSemana = "[Não encontrado!]";
        }
        System.out.println("O dia da semana é: " + nomeDoDiaDaSemana);
    }
}

package org.example.estruturadedecisaoswitch;
import java.util.Scanner;

//Crie uma variável chamada “fruta”. Esta variável deve receber uma string com o nome de uma fruta.
// Após, crie uma estrutura condicional switch que receba esta variável e que possua três casos:
// caso maçã, retorne no console: “Não vendemos esta fruta aqui”.
// Caso kiwi, retorne: “Estamos com escassez de kiwis”
// e caso melancia, retorne: “Aqui está, são 3 reais o quilo”.
// Teste com estas três opções e verifique o console do seu navegador.
// Crie também um default, que retornará uma mensagem de erro no console.
public class ExercicioSwitch1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====================================");

        System.out.print("Digite uma fruta: ");
        String fruta = scanner.nextLine();

        //String nomeDaFruta = fruta;

        switch (fruta) {
            case "maçã":
                //nomeDaFruta = "maçã";
                System.out.println("Não vendemos essa fruta aqui!");
                break;

            case "kiwi":
                //nomeDaFruta = "";
                System.out.println("Estamos com escassez de kiwis");
                break;

            case "melancia":
                //nomeDaFruta = "";
                System.out.println("Aqui está são R$ 3,00 o quilo!");
                break;

            default: fruta = "";
                System.out.println("Não temos essa fruta!");
        }
            scanner.close();
    }
}
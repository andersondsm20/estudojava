package org.example.listas;

import java.util.ArrayList;

/* Adicionando elementos com base em uma condição:
Crie um programa que, com base na lista original de frutas,
adicione a fruta "Melancia" à lista somente se ela ainda não estiver presente.
Em seguida, imprima a lista atualizada.*/
public class Exercicio_Listas07 {
    public static void main(String[] args) {
        ArrayList<String> minhaLista = new ArrayList<>();

        minhaLista.add("Maçã");
        minhaLista.add("Banana");
        minhaLista.add("Cereja");
        minhaLista.add("Uva");
        minhaLista.add("Pêssego");

        if (minhaLista.contains("Melancia")) {
            System.out.println("Já existe a fruta melancia");
        } else {
            minhaLista.add("Melancia");
            System.out.println("Fruta Melancia adicionada");
        }
    }
}
//        for (String fruta : minhaLista) {
//                if (fruta == "Melancia") {
//                System.out.println("Já existe a fruta melancia na lista!");
//
//            } else {
//                minhaLista.add("Melancia");
//                break;
//            }
//        }
//            System.out.println("Fruta Melancia adicionada a lista" +
//                    "\n" + minhaLista);
//        }
//        }
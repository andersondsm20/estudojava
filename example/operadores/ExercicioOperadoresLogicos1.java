package org.example.operadores;

import java.util.Scanner;

//Login Simples: Implemente um programa que peça ao usuário um nome de usuário e uma senha.
// Se as credenciais forem "admin" e "12345", exiba uma mensagem de boas-vindas;
// caso contrário, exiba uma mensagem de erro.
public class ExercicioOperadoresLogicos1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cadastro = "admin";
        cadastro = "12345";

        System.out.println("============== LOGIN SIMPLES ==============");

        System.out.print("Digite o seu nome: ");
        String nomeUsuario = scanner.findInLine("admin");

        System.out.print("Digite a sua senha: ");
        int senhaUsuario = scanner.nextInt();


        if (cadastro == "admin" && cadastro == "12345") {
            System.out.println("Seja Bem Vindo!");
            scanner.close();
        }

    }
}
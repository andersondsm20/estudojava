package org.example.operadores;

public class ExercicioOperadoresRelacionais {

    public static void main(String[] args) {
        int num_1 = 10;
        int num_2 = 20;

       boolean num_1EMenorQueNum_2 = num_1 < num_2;
        System.out.println("Número 10 é menor que Número 20? " + num_1EMenorQueNum_2);

        boolean num_2EMenorQueNum_1 = num_2 < num_1;
        System.out.println("Número 20 é menor que Número 10? " + num_2EMenorQueNum_1);

        boolean num_1EMaiorQueNum2 = num_1 > num_2;
        System.out.println("Número 10 é maior que Número 20? " + num_1EMaiorQueNum2);

        boolean num_2EMaiorQueNum_1 = num_2 > num_1;
        System.out.println("Número 20 é Maior que Número 10? " + num_2EMaiorQueNum_1);
    }
}

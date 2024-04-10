package org.example.scanner;
public class OperadoresRelacionais {
    public static void main(String[] args) {
        System.out.println("========================================================");

        int primeiraVariavel = 1;
        int segundaVariavel = 1;

        System.out.println("O valor da primeira variável é " + primeiraVariavel
                + " e da segunda é " + segundaVariavel + ".");

        //====================================================================================

        boolean primriraVariavelEMaiorQueASegunda = primeiraVariavel > segundaVariavel;
        System.out.println("Primeira variavél é menor que a segunda? " + primriraVariavelEMaiorQueASegunda);

        //=====================================================================================

        boolean primeiraVariavelEMenorQueASegunda = primeiraVariavel < segundaVariavel;
        System.out.println("Primeira Variavél é menor que a segunda? " + primeiraVariavelEMenorQueASegunda);

        //=====================================================================================

        boolean primeiraVariavelEMaiorIgualASegundaVariavel = primeiraVariavel >= segundaVariavel;
        System.out.println("Primeira variavél é maior ou igual a segunda? " + primeiraVariavelEMaiorIgualASegundaVariavel);

        //=================================================================================================

        boolean primeiraVariavelEMenorIgualASegunda = primeiraVariavel <= segundaVariavel;
        System.out.println("Primeira variavél e menor ou igual a segunda: " + primeiraVariavelEMenorIgualASegunda);

        //=======================================================================================

        boolean primeiraVariavelEIgualASegunda = primeiraVariavel == segundaVariavel;
        System.out.println("Primeira variavél é igual a segunda? " + primeiraVariavelEIgualASegunda);

        //========================================================================================

        boolean primeiraVariavelEDiferenteDaSegunda = primeiraVariavel != segundaVariavel;
        System.out.println("Primeira variavel é diferente da segunda? " + primeiraVariavelEDiferenteDaSegunda);

        //============================================================================================
        System.out.println("Fim!");
        System.out.println("==============================================================");
        }
    }
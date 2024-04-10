package org.example.revisaofor;
public class RevisaoFor1 {
    public static void main(String[] args) {
        System.out.println("#################### 1 ####################");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            /*
            i = 1 é <= 5 menor.
            i = 2 é <= 5 menor.
            i = 3 é <= 5 menor.
            i = 4 é <= 5 menor.
            i = 5 e <= 5 igual.
             */
        }
        System.out.println("################### 2 #####################");
        for (int j = 0; j <= 10; j++) {
            System.out.println(j);
            /*
            j = 0 <= 10 menor.
            j = 1 <= 10 menor.
            j = 2 <= 10 menor.
            j = 3 <= 10 menor.
            j = 4 <= 10 menor.
            j = 5 <= 10 menor.
            j = 6 <= 10 menor.
            j = 7 <= 10 menor.
            j = 8 <= 10 menor.
            j = 9 <= 10 menor.
            j = 10 <= 10 igual.
             */
        }
        System.out.println("#################### 3 ####################");
        for (int a = 1; a <= 3; a++) {
            System.out.println(a);
            /*
            a = 1 <= 3 menor.
            a = 2 <= 3 menor.
            a = 3 <= 3 igual.
             */
        }
        System.out.println("##################### 4 ###################");
        for (int c = 3; c >= 1; c--) { // se eu declarar c++ meu for fica em loop infinito
            System.out.println(c);
            /*
            c = 3 >= 1 maior.
            c = 2 >= 1 maior.
            c = 1 >= 1 igual.
             */
        }
    }
}
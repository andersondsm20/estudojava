package org.example.forewhile;

import java.util.Scanner;

public class ExercicioFor06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de filas: ");
        int numeroFilas = scanner.nextInt();
        scanner.close();


//        for (int altura = 1, asteristicos = 1; altura <= numeroFilas; altura++, asteristicos++) {
//            System.out.println("*".repeat(asteristicos));
//        }


        for (int altura = 1, asteristicos = 0; altura <= numeroFilas; altura++) {
            System.out.println("*".repeat(asteristicos));
        }
    }
}
/* Resolução
*
**
***
****
*****

Fim
 */

//usuario ira digitar o tamanho da piramide

// o aprendiz é um mestre em formação!

// modificar o programa atual, para que use apenas um for.


// for (int espacoBranco = 1; espacoBranco <= numeroFilas - altura; espacoBranco++) {
//             //   System.out.print(" ");
//           // }
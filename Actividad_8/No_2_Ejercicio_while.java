package Actividad_8;

import java.util.Scanner;

public class No_2_Ejercicio_while {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numeroLimite = scanner.nextInt();
        int i = 1;

        System.out.println("Números cuadrados perfectos menores que " + numeroLimite + " son:");

        while (i * i < numeroLimite) {
            System.out.println(i * i);
            i++;
        }

        scanner.close();
    }
}

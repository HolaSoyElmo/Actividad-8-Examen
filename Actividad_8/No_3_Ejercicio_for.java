package Actividad_8;

import java.util.Scanner;

public class No_3_Ejercicio_for {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer término: ");
        int primerTermino = scanner.nextInt();

        System.out.print("Ingrese la razón: ");
        int razon = scanner.nextInt();

        System.out.print("Ingrese el número de términos: ");
        int numeroTerminos = scanner.nextInt();

        System.out.println("Los términos de la progresión aritmética son:");

        for (int i = 0; i < numeroTerminos; i++) {
            int termino = primerTermino + i * razon;
            System.out.println(termino);
        }

        scanner.close();
    }
}

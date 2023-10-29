package Actividad_8;

public class No_1_Ejercicio_do_while {
    public static void main(String[] args){
        int num = 1000;
        int contador = 0; 

        System.out.println("Números múltiplos de tres entre 1000 y 1500: \n");

        do {
            if (num %3  == 0){
                System.out.println(num);
                contador++;
            }
            num++;
        } while (num < 1500);

        System.out.println("\nCantidad de números múltiplos de tres son " + contador);
    }
}
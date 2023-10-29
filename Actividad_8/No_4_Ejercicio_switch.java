package Actividad_8;

import java.util.Scanner;

public class No_4_Ejercicio_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double costoTotal = 0;

        System.out.print("Bienvenido | Cafeteria | UniSur\n\n");
        System.out.print("----------------------------------------------------------------\n¿Que decea pedir?\n\n"+
                         "Tipo Desayunos | Costo\n   1.Moderado    $45\n   2.Mediano     $50\n   3.Ex.Grande   $75\n   4.FULL        $120\n\n");
        
        do {
        System.out.print("----------------------------------------------------------------\n\n");
        System.out.print("Ingrese el número correspondiente al tipo de desayuno: ");
        int tipoDesayuno = scanner.nextInt();

        double costo = 0;

        switch (tipoDesayuno) {
            case 1:
                costo = 45;
                break;
            case 2:
                costo = 50;
                break;
            case 3:
                costo = 75;
                break;
            case 4:
                costo = 120;
                break;
            default:
                System.out.println("[ERROR] Tipo de desayuno no válido. Error.");
                break;
        }

        if (costo > 0) {
            costoTotal += costo;
            System.out.println("Desayuno agregado al pedido. Costo total: $" + costoTotal);
        } else {
                System.out.println("No se ha agregado ningún desayuno al pedido.");
        }

        System.out.print("\n\n¿Desea agregar otro desayuno? (Sí=1, No=0): ");
    } while (scanner.nextInt() == 1);
        
        double costoServicio = costoTotal * 0.05;
        double propinas = costoTotal * 0.02;
        double montoTotal = costoTotal + costoServicio + propinas;

        System.out.print("----------------------------------------------------------------\nCuenta\n\n");
        System.out.println("Costo del desayuno: $" + costoTotal);
        System.out.println("Costo del servicio (5%): $" + costoServicio);
        System.out.println("Propinas (2%): $" + propinas);
        System.out.println("Monto total a pagar: $" + montoTotal);

        scanner.close();
    }
}
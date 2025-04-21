package Conversors;

import AricmeticOperations.AricmeticOperationsMenu;
import AricmeticOperations.BasicArtimeticOperations;
import GeometricFroms.GeometricFormsMenu;

import java.util.Scanner;

public class ConversorsMenu {
    public static void inicio (Scanner scanner) {
        int opcion;
        Conversors number = new Conversors(50);
        do {

            //Opciones del menú
            System.out.println("\n" +
                    "MENU Conversores");
            System.out.println("" +
                    "Elija una opción: \n");
            System.out.println(
                    "1: Temperaturas \n" +
                            "2: Distancia\n" +
                            "3: Peso\n" +
                            "4: Salir\n");

            System.out.print("" +
                    "Seleccione del 1 al 4: ");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println(number.celciusToFarenheit());
                    break;
                case 2:
                    System.out.println(number.farenheitToCelcius());
                    break;
                case 3:
                    ConversorsMenu.inicio(scanner);
                    break;
                case 4:
                    System.out.println("Cerrando");
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } while(opcion != 3);
    }
}

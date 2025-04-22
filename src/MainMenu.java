import AricmeticOperations.AricmeticOperationsMenu;
import Conversors.ConversorsMenu;
import GeometricFroms.GeometricFormsMenu;

import java.util.Scanner;

public class MainMenu {
    public static void mainMenu (Scanner scanner) {

    int opcion;
        do {

            //Opciones del menú
            System.out.println("\n" +
                    "MENU Principal" + "\n###############");
            System.out.println("\n" +
                    "Elija una opción: \n");
            System.out.println(
                    "1: Operaciones Aritmeticas \n" +
                            "2: Formas Geométricas\n" +
                            "3: Conversores\n" +
                            "4: Salir\n");

            System.out.print("" +
                    "Seleccione del 1 al 4: ");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    AricmeticOperationsMenu.iniciar(scanner);
                    break;
                case 2:
                    GeometricFormsMenu.inicio(scanner);
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

        } while(opcion != 4);
    }
}

import AricmeticOperations.AricmeticOperationsMenu;
import GeometricFroms.GeometricFormsMenu;

import java.util.Scanner;

public class MainMenu {
    public static void mainMenu (Scanner scanner) {

    int opcion;
        do {

            //Opciones del menú
            System.out.println("\n" +
                    "MENU");
            System.out.println("" +
                    "Elija una opción: \n");
            System.out.println(
                    "1: Operaciones Aritmeticas \n" +
                            "2: Formas Geométricas\n" +
                            "3: Salir\n");

            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    AricmeticOperationsMenu.iniciar(scanner);
                    break;
                case 2:
                    GeometricFormsMenu.inicio(scanner);
                    break;
                case 3:
                    System.out.println("Cerrando");
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } while(opcion != 3);
    }
}

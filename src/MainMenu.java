import AricmeticOperations.AricmeticOperationsMenu;
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
                            "2: ¿¿??\n" +
                            "3: Salir\n");

            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    aricmeticOperationsMenu();
                    break;
                case 2:
                    System.out.println("Sin completar");
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

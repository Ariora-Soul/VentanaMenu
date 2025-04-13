package GeometricFroms;

import java.util.Scanner;

public class GeometricFormsMenu {
    public static void inicio (Scanner scanner){

        System.out.println("\nMENU");
        System.out.println("Seleccione la operación que desee realizar: \n");
        System.out.println("1: Cuadrado \n2: Triangulo\n");


        boolean menuStay = true;
        while (menuStay) {

            System.out.print("Inserte operacion 1-2: ");

            Scanner opcion = new Scanner(System.in);

            switch (opcion.nextInt()){
                case 1:
                    GeometricForms.square(scanner);
                    break;
                case 2:
                    GeometricForms.triangle(scanner);
                    break;
                default:
                    System.out.println("Esa opcion no es correcta");
            }

            System.out.print("\n¿Desea otra operación? true o false: ");
            Scanner newOperation = new Scanner(System.in);
            if(newOperation.nextBoolean() == false) {
                menuStay = false;
            }
        }
    }
}

package Conversors;

import GeometricFroms.GeometricForms;
import java.util.Scanner;

public class ConversorsMenu {
    public static void inicio (Scanner scanner) {
        System.out.println("\nMENU Conversores" + "\n###############");
        System.out.println("\nSeleccione la conversión que desee realizar: \n");
        System.out.println("1: De Celcius a Farenheit \n2: De Farenheit a Celcius\n");

        Conversors convert = new Conversors();

        boolean menuStay = true;
        while (menuStay) {

            System.out.print("Seleccione conversión 1-2: ");

            Scanner opcion = new Scanner(System.in);

            switch (opcion.nextInt()){
                case 1:
                    System.out.println("La conversión a Farenheit es: " + convert.celciusToFarenheit());
                    break;
                case 2:
                    System.out.println("La conversión a Celcius es: " + convert.farenheitToCelcius());
                    break;
                default:
                    System.out.println("Esa opcion no es correcta");
            }

            System.out.print("\n¿Desea otra conversión? true o false: ");
            Scanner newOperation = new Scanner(System.in);
            if(newOperation.nextBoolean() == false) {
                menuStay = false;
            }
        }
    }
}

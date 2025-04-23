package GuessNumber;

import java.util.Scanner;

public class GuessNumberMenu {
    public static void iniciar(Scanner scanner){
        /*Crea el objeto operación
         * Esto puede mejorar, para que el usuario inserte los valores.
         * */
        GuessNumber operation = new GuessNumber(2,2);

        //Mensajes del CLI
        System.out.println("\nMENU Adivinar" + "\n###############");
        System.out.println("\nAdivina el número: \n");
        System.out.println("1: Texto \n2: Texto\n");

        //Mostrar valores del objeto
        System.out.println(operation);

        //variable para el while
        boolean menuStay = true;

        //bucle while para pedir operaciones hasta que el usuario escriba false
        while (menuStay) {

            //Mostrar valores del objeto
            System.out.print("Inserte operacion 1-6: ");

            Scanner opcion = new Scanner(System.in);
            //Switch de selección
            switch (opcion.nextInt()){
                case 1:
                    System.out.println("texto");
                    break;
                case 2:
                    System.out.println("texto");
                    break;

                default:
                    System.out.println("Esa opcion no es correcta");
            }

            /*  creo que es posible mejorar esta implementación
             *
             * */
            System.out.print("¿Desea otra operación? true o false: ");
            Scanner newOperation = new Scanner(System.in);
            if(newOperation.nextBoolean() == false) {
                menuStay = false;
            }
        }
    }
}

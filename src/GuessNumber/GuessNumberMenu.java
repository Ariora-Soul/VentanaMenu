package GuessNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberMenu {
    public static void iniciar(Scanner scanner){

        GuessNumber number = new GuessNumber();
        int adivina = number.randomGuessNumber();
        System.out.println(adivina);

        //CLI text
        System.out.println("Se ha generado un número aleatorio entre el 0 y 10\n");
        System.out.println("\nMENU Adivinar" + "\n###############");
        System.out.println("1: ¡Quiero adivinarlo! \n2: Necesito pistas...\n");

       boolean menuStay = true;

        while (menuStay) {

            System.out.print("Bla bla: ");

            Scanner opcion = new Scanner(System.in);
            switch (opcion.nextInt()){
                case 1:
                    number.tryGuessing();
                    break;
                case 2:
                    number.hintPlease();
                    break;

                default:
                    System.out.println("Esa opcion no es correcta");
            }

            System.out.print("¿Desea otra operación? true o false: ");
            Scanner newOperation = new Scanner(System.in);
            if(newOperation.nextBoolean() == false) {
                menuStay = false;
            }
        }
    }
}

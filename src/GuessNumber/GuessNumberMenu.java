package GuessNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberMenu {
    public static void iniciar(Scanner scanner){

        //Crea la clase y la variable que almacena el numero aleatorio.
        GuessNumber number = new GuessNumber();
        int adivina = number.randomGuessNumber();

        //lo imprime
        System.out.println(adivina);

       boolean menuStay = true;
        while (menuStay) {

            number.tryGuessing();

            System.out.print("¿Desea otra operación? true o false: ");
            Scanner again = new Scanner(System.in);
            if(again.nextBoolean() != true) {
                menuStay = false;
            }
        }
    }
}

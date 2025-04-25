package GuessNumber;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private int adivina;

    GuessNumber () {
        this.adivina = randomGuessNumber();
    }

    int randomGuessNumber() {
        Random guess = new Random();
        int random = guess.nextInt(10);
        return random;
    }

    public void hintPlease(){

    }

    public void tryGuessing(){

        for(int trys = 1; trys <= 3; trys++) {
            Scanner insertedNumber = new Scanner(System.in);
            System.out.print("Nº de intentos: " + trys);
            System.out.print("\n¿Qué número es?: ");

            if(adivina == insertedNumber.nextInt()) {
                System.out.println("Correcto");
                trys = 4;
            } else {
                System.out.println("Incorrecto...\n");
            }
        }

    }
}

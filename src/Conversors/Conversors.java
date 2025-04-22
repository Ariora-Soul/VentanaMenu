package Conversors;

import java.util.Scanner;

public class Conversors {

    Scanner askTemperature = new Scanner(System.in);

    // constructor por defecto de la clase
    Conversors() {}

    public int celciusToFarenheit  () {
        System.out.print("Añada un valor en Celcius a convertir: ");
        int temperature = askTemperature.nextInt();
        return temperature * (9/5) + 32;
    }

    public int farenheitToCelcius  () {
        System.out.print("Añada un valor en Farenheit a convertir: ");
        int temperature = askTemperature.nextInt();
        return ((temperature - 32) * 5)/9;
    }
}

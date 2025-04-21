package Conversors;

import java.util.Scanner;

public class Conversors {

    private int temperatura;
    // constructor por defecto de la clase
    Conversors(int temperatura) {
        this.temperatura = temperatura;
    }

    public int celciusToFarenheit  () {
        return temperatura * (9/5) + 32;
    }

    public int farenheitToCelcius  () {
        return ((temperatura - 32) * 5)/9;
    }
}

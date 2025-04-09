import java.util.Random;

public class BasicArtimeticOperations {

    /*Random numeroRandomUno = new Random();
    Random numeroRandomDos = new Random();*/

    //variables privadas de los 2 números
    private int firstNumber;
    private int secondNumber;

    //getters y setters de ambas variables
    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    // constructor por defecto de la clase
    BasicArtimeticOperations() {
    System.out.println("Sin numeros asignados");
    }

    // constructor por defecto de la clase
    BasicArtimeticOperations(int firstNumber, int secondNumber) {
    this.firstNumber = firstNumber;
    this.secondNumber = secondNumber;
    }

    @Override
    public String toString() {
        return String.format("Los valores son: %d y %d",this.firstNumber,this.secondNumber);
    }

    //metodo de suma
    int sum() {
        System.out.print("Suma de " + this.firstNumber + " + " + this.secondNumber + " = ");
        return firstNumber + secondNumber;
    }

    //metodo de resta
    int sustrac() {
        System.out.print("Resta de " + this.firstNumber + " - " + this.secondNumber + " = ");
        return firstNumber - secondNumber;
    }

    //metodo de multiplicacion
    int multiply() {
        System.out.print("Multiplicación de " + this.firstNumber + " * " + this.secondNumber + " = ");
        return firstNumber * secondNumber;
    }

    //metodo de division
    int division() {
        System.out.print("División de " + this.firstNumber + " / " + this.secondNumber + " = ");
        return firstNumber / secondNumber;
    }

    //metodo de modulo
    int modulo() {
        System.out.print("Módulo de " + this.firstNumber + " % " + this.secondNumber + " = ");
        return firstNumber % secondNumber;
    }

    //metodo de aletorio
    //este metodo selecciona 2 numeros aleatorios del 0 al 100 y los suma
    int randomOperation() {
        Random randomNumberOne = new Random();
        Random randomNumberTwo = new Random();
        int numberOne = randomNumberTwo.nextInt(100);
        int numberTwo = randomNumberTwo.nextInt(100);

        System.out.print("Suma de " + numberOne + " + " + numberTwo + " = ");
        return numberOne + numberTwo;
    }

}

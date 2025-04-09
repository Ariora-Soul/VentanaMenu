
public class Main {
    public static void main(String[] args) {

    //Crea objeto de la clase BasicArtimeticOperations
    BasicArtimeticOperations operation = new BasicArtimeticOperations(4,2);

    System.out.println("Los numeros son: "+operation);
    //Operaciones basicas
    System.out.println("Suma de " + operation.getFirstNumber() + " + " +operation.getSecondNumber()
            + " = " +operation.sum());
    System.out.println("Resta de " + operation.getFirstNumber() + " - " +operation.getSecondNumber()
                + " = " +operation.sustrac());
    System.out.println("Multipliación de " + operation.getFirstNumber() + " * " +operation.getSecondNumber()
                + " = " +operation.multiply());
    System.out.println("División de " + operation.getFirstNumber() + " / " +operation.getSecondNumber()
                + " = " +operation.division());
    System.out.println("Modulo de " + operation.getFirstNumber() + " % " +operation.getSecondNumber()
                + " = " +operation.modulo());
    }
}
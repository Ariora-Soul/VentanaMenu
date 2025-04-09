
public class Main {
    public static void main(String[] args) {

    //Crea objeto de la clase BasicArtimeticOperations
    BasicArtimeticOperations operation = new BasicArtimeticOperations(30,10);

    //Mostrar valores del objeto
    System.out.println(operation);

    //Operaciones basicas
    System.out.println(operation.sum());
    System.out.println(operation.sustrac());
    System.out.println(operation.multiply());
    System.out.println(operation.division());
    System.out.println(operation.modulo());

    //random
    System.out.println(operation.randomOperation());

    }
}
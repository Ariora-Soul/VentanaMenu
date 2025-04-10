import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*Crea el objeto operación*/
    BasicArtimeticOperations operation = new BasicArtimeticOperations(2,2);

    /*Mensajes del CLI*/
    System.out.println("\nMENU");
    System.out.println("Seleccione la operación que desee realizar: \n");
    System.out.println("1: Suma \n2: Resta\n3: Multiplicación" +
            "\n4: División\n5: Modulo\n6: Suma random\n");

    //Mostrar valores del objeto
    System.out.println(operation);

    //while para repetir la inserción de operaciones

    //Mostrar valores del objeto
    System.out.print("Inserte operacion 1-6: ");

    //Escáner
    Scanner opcion = new Scanner(System.in);

    while (opcion.nextInt() < 8) {

    //Switch selección
        switch (opcion.nextInt()){
        case 1:
            int resultadoSuma = operation.sum();
            System.out.println(resultadoSuma);
            break;
        case 2:
            int resultadoResta = operation.sustrac();
            System.out.println(resultadoResta);
            break;
        case 3:
            int resultadoMultiply = operation.multiply();
            System.out.println(resultadoMultiply);
            break;
        case 4:
            int resultadoDivision = operation.division();
            System.out.println(resultadoDivision);
            break;
        case 5:
            int resultadoModule = operation.modulo();
            System.out.println(resultadoModule);
            break;
        case 6:
            int resultadoRandom = operation.randomOperation();
            System.out.println(resultadoRandom);
            break;
        default:
            System.out.println("Esa opcion no es correcta");
    }
  }
 }
}
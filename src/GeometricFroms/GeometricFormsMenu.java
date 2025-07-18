package GeometricFroms;
import java.util.Scanner;

public class GeometricFormsMenu {
    public static void inicio (Scanner scanner){
        System.out.println("\nMENU Formas" + "\n###############");
        System.out.println("\nSeleccione la forma que desee ver: \n");
        System.out.println("1: Cuadrado \n2: Triangulo\n3: Triangulo Superior\n4: Rectángulo\n5: Triángulo Equilátero\n");


        boolean menuStay = true;
        while (menuStay) {

            System.out.print("Inserte operacion 1-5: ");

            Scanner opcion = new Scanner(System.in);

            switch (opcion.nextInt()){
                case 1:
                    GeometricForms.square(scanner);
                    break;
                case 2:
                    GeometricForms.triangle(scanner);
                    break;
                case 3:
                    GeometricForms.triangleSuperior(scanner);
                    break;
                case 4:
                    GeometricForms.rectangle(scanner);
                    break;
                case 5:
                    GeometricForms.trianguloEquilatero(scanner);
                    break;
                default:
                    System.out.println("Esa opcion no es correcta");
            }

            System.out.print("\n¿Desea otra operación? true o false: ");
            Scanner newOperation = new Scanner(System.in);
            if(newOperation.nextBoolean() == false) {
                menuStay = false;
            }
        }
    }
}

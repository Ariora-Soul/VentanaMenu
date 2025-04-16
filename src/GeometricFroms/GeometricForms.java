package GeometricFroms;

import java.util.Scanner;

public class GeometricForms {
    public static void square(Scanner scanner) {
        System.out.println("Imprimiendo un cuadrado:\n");

        System.out.print("¿Cuantas filas de alto quieres?: ");
        int x = scanner.nextInt();

        if(x < 2) {
            System.out.println("No es posible hacer un cuadrado menor a 2 filas!");
        } else {

            for (int i = 0; i < x; i++) {

                for (int y = 0; y < x; y++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }

    public static void triangle(Scanner scanner) {
        System.out.println("Imprimiendo un Triangulo:\n");

        int alto = 5;
        int ancho = 1;
        for (int y = 0; y < alto; y++) {
            for (int x = 0; x < ancho; x++) {
                System.out.print("*");
            }
            ancho += 1;
            System.out.println("");
        }
    }

    public static void triangleSuperior(Scanner scanner) {
        System.out.println("Imprimiendo un Triangulo:\n");

        int alto = 5;
        int ancho = 1;
        for (int y = 0; y < alto; y++) {
            for (int x = 5; x >= ancho; x--) {
                System.out.print("*");
            }
            ancho += 1;
            System.out.println("");
        }
    }

    public static void rectangle(Scanner scanner) {
        System.out.println("Imprimiendo un Rectángulo:\n");

        int alto = 5;
        int ancho = 10;
        for(int y = 0;y < alto; y++){
            for (int x = 0;x < ancho; x++){
                System.out.print("*");
                }
            System.out.println("");
            }
        }

    public static void trianguloEquilatero(Scanner scanner) {


        System.out.println("Imprimiendo un Triángulo Equilátero:\n");

        int filas = 5;

        //Código para las filas
        for(int y = 0; y < filas; y++){

            //espacios
            for (int espacios = 0; espacios < filas - y - 1 ;espacios++){
                System.out.print(" ");
            }

            //asteriscos
            for (int asteriscos = 0; asteriscos < (2 * y + 1); asteriscos++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}


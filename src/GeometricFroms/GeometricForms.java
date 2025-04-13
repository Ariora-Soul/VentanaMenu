package GeometricFroms;

import java.util.Scanner;

public class GeometricForms {
    public static void square(Scanner scanner) {
        System.out.println("Imprimiendo un cuadrado:\n");

        int x = 5;
        int ancho = 5;
        for(int i=0; i<x; i++){

            for(int y=0; y<ancho; y++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void triangle(Scanner scanner) {
        System.out.println("Imprimiendo un Triangulo:\n");

        int alto = 5;
        int ancho = 1 ;
        for(int y=0; y < alto; y++){
            for(int x=0; x < ancho; x++){
                System.out.print("*");
            }
            ancho += 1;
            System.out.println("");
        }
    }
}

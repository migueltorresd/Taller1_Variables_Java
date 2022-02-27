package TallerJava.Taller1;

import TallerJava.Taller1.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static boolean bandera = true;
    private static int opcion;

    public static void main(String[] args) throws IOException {
        do {
            limpiarPantalla();
            menu();
            opcion = capturarOpcion();
            bandera = evaluarOpcion(opcion);
        } while (bandera == true);
    }

    private static void menu() {
        System.out.println("------- No.1 Taller de variables ------- ");
        System.out.println("Escoja un punto del taller");
        System.out.println("1. Ejercicio #1");
        System.out.println("2. Ejercicio #2");
        System.out.println("3. Ejercicio #3");
        System.out.println("4. Ejercicio #4");
        System.out.println("5. Ejercicio #5");
        System.out.println("0. Salir del taller");
    }

    private static int capturarOpcion() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    private static boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                Punto1 p1 = new Punto1();
                p1.Punto1();
                return true;
            // break;
            case 2:
                Punto2 p2 = new Punto2();
                p2.Punto2();
                return true;
            // break;
            case 3:
                Punto3 p3 = new Punto3();
                p3.Punto3();
                return true;
            // break;
            case 4:
                Punto4 p4 = new Punto4();
                p4.Punto4();
                return true;
            case 5:
                Punto5 p5 = new Punto5();
                p5.Punto5();
                return true;
            // break;
            case 0:
                return false;
            // break;
            default:
                System.out.println("Opción incorrecta");
                System.in.read();
        }
        return true;
    }

    private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


}

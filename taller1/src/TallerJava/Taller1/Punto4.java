package TallerJava.Taller1;

import java.util.Scanner;

public class Punto4 {

    private String ciudad;
    private String Pais;

    public void Punto4() {
        
        solicitarCuidad();
        String cuidad = capturarDatoString();

        solicitarPais();
        String Pais = capturarDatoString();

        System.out.println("La cuidad de " + cuidad + " es la capital de " + Pais + ".");
        System.out.println("------- Fin del ejercicio ------- ");
        System.out.println(" ");
    }

    private void solicitarCuidad() {
        System.out.println("Por favor ingrese nombre de la capital:");
    }

    private void solicitarPais() {
        System.out.println("Por favor ingrese el nombre del pais:");
    }


    private String capturarDatoString() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

}
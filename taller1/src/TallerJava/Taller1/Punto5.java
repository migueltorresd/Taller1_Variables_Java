package TallerJava.Taller1;

import java.util.Scanner;

public class Punto5 {
    private String nombremascota;
    private String nombre;
    private int edadmascota;
    private String tipo;
    private Scanner input;

    public void Punto5() {

        input = new Scanner(System.in);

        solicitarNombreMascota();
        nombremascota = capturarDatoString();

        solicitarNombre();
        nombre = capturarDatoString();

        solicitarTipo();
        tipo = capturarDatoString();

        solicitarEdadMascota();
        edadmascota = capturarDatoInt();

        System.out.println(nombremascota + " es un@ "+ tipo +" el cual tiene " + edadmascota+ " años de edad y " + nombre + " es actualmente su dueñ@");
        System.out.println("------- Fin del ejercicio ------- ");
        System.out.println(" ");
    }
        private void solicitarNombreMascota() {
            System.out.println("Por favor digite el nombre de su mascota:");
        }

        private void solicitarNombre() {
            System.out.println("Por favor digite su nombre:");
        }

        private void solicitarEdadMascota() {
            System.out.println("Por favor digite la edad de su mascota en años");
        }

        private void solicitarTipo() {
            System.out.println("Por favor digite tipo de mascota");
        }

        private String capturarDatoString() {
            return input.nextLine();
        }

        private int capturarDatoInt() {
            return input.nextInt();
        }
         private double capturarDatoDouble() {
            return input.nextDouble();
    }

    }


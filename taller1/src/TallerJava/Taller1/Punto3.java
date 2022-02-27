package TallerJava.Taller1;

import java.util.Scanner;
public class Punto3 {

    private String nombre;
    private String apellidos;
    private String nombremadre;
    private String nombrepadre;
    private Scanner input;

    public void Punto3 () {
        input = new Scanner(System.in);

        solicitarNombre();
        nombre = capturarDatoString();

        solicitarApellido();
        apellidos = capturarDatoString();

        solicitarNombremadre();
        nombremadre = capturarDatoString();

        solicitarNombrepadre();
        nombrepadre = capturarDatoString();

        System.out.println("yo " + nombre + " " + apellidos + " soy hijo de " + nombremadre + " y " + nombrepadre);
        System.out.println("------- Fin del ejercicio ------- ");
        System.out.println(" ");
    }
        private void solicitarNombre() {
            System.out.println("Por favor digite su nombre:");
    }
        private void solicitarApellido() {
            System.out.println("Por favor digite sus apellidos:");
    }
        private void solicitarNombremadre() {
            System.out.println("Por favor digite el nombre de su madre:");
    }
        private void solicitarNombrepadre() {
            System.out.println("Por favor digite el nombre de su padre:");
    }
        private String capturarDatoString() {
            return input.nextLine();
    }

}

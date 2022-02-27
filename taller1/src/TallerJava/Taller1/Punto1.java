package TallerJava.Taller1;
import java.util.Scanner;
public class Punto1 {

    private String nombre;
    private String apellidos;

    public void Punto1() {

        solicitarNombre();
        nombre = capturarDato();

        solicitarApellido();
        apellidos = capturarDato();

        System.out.println("------- Fin del ejercicio ------- ");
        System.out.println(" ");
    }

    private void solicitarNombre() {
        System.out.println("Por favor digite su nombre");
    }

    private void solicitarApellido() {
        System.out.println("Por favor digite su apellido");
    }
// capturar datos//

    private String capturarDato() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

}

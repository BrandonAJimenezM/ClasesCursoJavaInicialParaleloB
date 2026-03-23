package escribirArchivo;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {
	public static void main(String[] args) {

        try {
            FileWriter escribir = new FileWriter("datos.txt");

            escribir.write("Juan,20\n");
            escribir.write("Ana,25\n");

            escribir.close();

            System.out.println("Datos guardados");

        } catch (IOException e) {
            System.out.println("Error al escribir");
        }
    }
}

package lectura;

import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivo {
	public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("datos.txt");

            int dato;

            while ((dato = reader.read()) != -1) {
                System.out.print((char) dato);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error al leer");
        }
    }
}

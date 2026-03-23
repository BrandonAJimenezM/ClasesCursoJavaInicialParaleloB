package escribirbyte;

import java.io.FileOutputStream;
import java.io.IOException;

public class Escribir {
	public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("datos.txt");

            String texto = "Hola Mundo";
            fos.write(texto.getBytes());

            fos.close();

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}

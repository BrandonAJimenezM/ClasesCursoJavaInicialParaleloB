package copiarArchivos;

import java.io.*;

public class CopiarArchivos {
	public static void main(String[] args) {

        try {
            FileInputStream entrada = new FileInputStream("origen.txt");
            FileOutputStream salida = new FileOutputStream("copia.txt");

            int dato;

            while ((dato = entrada.read()) != -1) {
                salida.write(dato);
            }

            entrada.close();
            salida.close();

            System.out.println("Archivo copiado correctamente");

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}

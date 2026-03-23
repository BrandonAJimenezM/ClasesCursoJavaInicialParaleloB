package crearArchivo;

import java.io.*;

public class CrearArchivo {
	public static void main(String[] args) {

        try {
            File archivo = new File("datos.txt");

            if (archivo.createNewFile()) {
                System.out.println("Archivo creado");
            } else {
                System.out.println("El archivo ya existe");
            }

        } catch (IOException e) {
            System.out.println("Error al crear");
        }
    }
}

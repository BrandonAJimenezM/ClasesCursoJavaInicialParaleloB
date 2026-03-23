package leerByte;

import java.io.FileInputStream;
import java.io.IOException;

public class Leer {
	public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("datos.txt");

            int dato;

            while ((dato = fis.read()) != -1) {
                System.out.print((char) dato);
            }

            fis.close();

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}

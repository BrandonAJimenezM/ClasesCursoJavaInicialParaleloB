package contadorPalabras;

import java.io.*;

public class Contador {
	public static void main(String[] args) {

        int lineas = 0;
        int palabras = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("texto.txt"));
            String linea;

            while ((linea = br.readLine()) != null) {
                lineas++;

                String[] palabrasLinea = linea.split(" ");
                palabras += palabrasLinea.length;
            }

            br.close();

            System.out.println("Lineas: " + lineas);
            System.out.println("Palabras: " + palabras);

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}

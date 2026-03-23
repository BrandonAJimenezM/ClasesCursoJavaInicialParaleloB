package buscarUsuario;

import java.io.*;
import java.util.Scanner;

public class Buscar {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese nombre: ");
		String buscado = sc.nextLine();

		try {
			BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"));
			String linea;

			while ((linea = br.readLine()) != null) {

				String[] datos = linea.split(",");

				if (datos[0].equalsIgnoreCase(buscado)) {
					System.out.println("Encontrado:");
					System.out.println(linea);
				}
				else {
					System.out.println("No se a encontrado el Usuario");
					break;
				}
			}

			br.close();

		} catch (IOException e) {
			System.out.println("Error");
		}
		finally {
			sc.close();
		}
	}
}

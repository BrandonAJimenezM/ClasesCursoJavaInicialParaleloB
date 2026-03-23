package repasoManejoArchivos;

import static repasoManejoArchivos.ManejoArchivos.*;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in); 
		// Debemos poner una ruta que exista y tenga los permisos necesarios 
		
		String ruta = "C:\\RepositorioTexto\\RankingJuegos2026.txt";
		
		//crearArchivo(ruta);
		
		int decisionUser = 0;
		
		do {
			System.out.println("1. Ingresar titulo (ESTO BORRARA LO ENTERIOR HECHO)\n"
							+ "2. Leer Archivo\n"
							+ "3. Añadir juego (PROCURE INGRESAR PRIMER UN TITULO) \n"
							+ "4. Salir\n");
			
			try {
				decisionUser = sc.nextInt();
				sc.nextLine();
				
				switch (decisionUser) {
				case 1 : 
					System.out.println("\t--- INGRESE EL TITULO QUE QUIERE PARA SU RANKING!! ---\n");
					String textoUser = sc.nextLine();
					insertarTexto(ruta, textoUser);
					break;
				case 2: 
					System.out.println("Contenido del archivo .txt");
					leerArchivo(ruta);
					break;
				case 3:
					System.out.println("Ingrese un nuevo juego y su puntaje");
					String textoUser2 = sc.nextLine();
					anexarTextoArchivo(ruta, textoUser2);
					break;
				case 4: 
					System.out.println("Saliendo del sistema...");
					break;
				default:
					System.out.println("Opcion no valida!");
				}
				
				
			} catch (InputMismatchException e ) {
				System.out.println("Opcion no valida!");
				sc.nextLine(); // Limpiar el buffer corrupto
			}	
		}while(decisionUser!= 4);
		
		sc.close();
		
		
		
	}
	
}

package repasoManejoArchivos;

import static repasoManejoArchivos.LogicaJuego.*;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AppJuegos {
	
public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in); 
		// Debemos poner una ruta que exista y tenga los permisos necesarios 
		
		LogicaJuego logicaJuego = new LogicaJuego();
		
		int decisionUser = 0;
		
		do {
			System.out.println("1. IngresarJuego\n"
							+ "2. Mostrar todos los juegos\n"
							+ "3. Resumen \n"
							+ "4. Crear archivo\n"
							+ "5. Leer Archivo\n"
							+ "6. Salir\n");
			
			try {
				decisionUser = sc.nextInt();
				sc.nextLine();
				
				switch (decisionUser) {
				case 1 : 
					System.out.println("Nombre: ");
					String textoUser = sc.nextLine();
					System.out.println("Puntuacion: ");
					int score = sc.nextInt();
					
					Juego juego = new Juego(textoUser, score);
					logicaJuego.registrarJuego(juego);
					//logicaJuego.anexarTextoArchivo(juego);
					break;
				case 2: 
					logicaJuego.mostrarTodos();
					break;
				case 3:
					logicaJuego.mostrarResumen();
				case 4: 
					logicaJuego.crearArchivo();
					break;
				case 5: 
					logicaJuego.leerArchivo();
				case 6: 
					System.out.println("saliendo del programa...");
				default:
					System.out.println("Opcion no valida!");
				}
				
				
			} catch (InputMismatchException e ) {
				System.out.println("Opcion no valida!");
				sc.nextLine(); // Limpiar el buffer corrupto
			}	
		}while(decisionUser!= 6);
		
		sc.close();
		
		
		
	}

}

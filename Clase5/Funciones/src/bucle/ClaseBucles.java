package bucle;

import java.util.Scanner;

public class ClaseBucles {
	public static void main(String[] args) {
		
		// Suma de un numero hasta que cumpla la condicion

		Scanner sc = new Scanner(System.in);
/*
		// Recorre el numero

		for (int i = 0; i <= 10; i++) {
			System.out.println("indice " + i);
		}

		// Recorre un array

		int[] listaNumeros = { 1, 2, 3, 4 };
		for (int i = 0; i < listaNumeros.length; i++) {
			System.out.println(listaNumeros[i]);
		}
	*/
	/*	// EJERCICIO TIPO FOR

		System.out.println("\t PROGRAMA FOR!");

		System.out.println("Ingrese el texto que quiere repetir!");
		String textoUser = sc.nextLine();

		if (textoUser != null && !textoUser.isEmpty()) {

			System.out.println("Cuantas veces quieres que se repita el texto?");
			int numeroUser = sc.nextInt();

			for (int i = 0; i < numeroUser; i++) {
				System.out.println(textoUser);
			}
		}

		// EJERCICIO TIPO WHILE

		int sumaTotal = 0;

		while (sumaTotal < 20) {
			System.out.println("Ingrese un numero para que sea sumado!");
			int numeroUser = sc.nextInt();
			sumaTotal += numeroUser;
		}

		System.out.println("Has superado el limite: " + sumaTotal);
		System.out.println("Has salido exitosamente del bucle!");
*/
		// EJERCICIO TIPO DO WHILE
		// DISCOTECA
		System.out.println("\tDISCOTECA");

		int edadUser;

		System.out.println("\t ENTRADA JUNGLE");

		do {
			System.out.print("\nIngrese edad del cliente (escriba '0' para cerrar): ");
			edadUser = sc.nextInt();

			// CASO 1: CIERRE (BREAK)
			if (edadUser == 0) {
				System.out.println("Cerrando la puerta. ¡No entra nadie más!");
				break; // Rompe el bucle por completo
			}

			// CASO 2: MENOR DE EDAD (CONTINUE)
			if (edadUser < 18) {
				System.out.println("Acceso denegado: Eres menor de edad.");
				System.out.println("¡QUE PASE EL SIGUIENTE!");
				continue; // Salta DIRECTO a la condición del while
			}

			// CASO 3: ÉXITO (FLUJO NORMAL)
			System.out.println("¡Bienvenido! Toma tu pulsera...");
			System.out.println("Registrando cliente en el sistema...");

		} while (edadUser != 0);

		System.out.println("\nPrograma terminado. El guardia se fue a dormir. ZzzZZZzz");

		edadUser = sc.nextInt();

		while (edadUser != 0) {

			System.out.println("No puede ingresar eres menor de edad!");
		}

		System.out.println("Como es while, no ejecuta lo de adentro");

	}
}

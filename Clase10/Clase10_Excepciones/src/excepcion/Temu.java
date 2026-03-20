package excepcion;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Temu {
	
	
	public static void main(String[] args) {
		String nombre;//Leandro5
		int cantidad = 0;
		Scanner sc = new Scanner (System.in);
		
		//VALIDACION DE NOMBRE
		while (true) {
			System.out.println("Ingrese el nombre de usuario");
			nombre = sc.nextLine();
			boolean tieneNumero = false;
			char letra;
			
			for (int i = 0; i < nombre.length(); i++) {
				letra = nombre.charAt(i);
				if (letra>='0' && letra <= '9') {
					tieneNumero = true;
					System.out.println("Error: No admite números.");
					break;
				}
			}
			
			if (!tieneNumero && !nombre.isEmpty()) {
				System.out.println("Ingresado con éxito.");
				break;
			} else {
				System.out.println("Ingrese nuevamente.");
			}
		}
		
		//VALIDACION DE NÚMERO
		while (true) {
			try {
				System.out.println("Ingrese la cantidad de productos");
				cantidad = sc.nextInt();
				
				if (cantidad > 0) {
					System.out.println("Ingresado con éxito");
					break;
				} else {
					System.out.println("La cantidad debe ser mayor a 0");
				}
			} catch (InputMismatchException e) {
				System.out.println("Error. Debe ingresar un numero entero.");
				sc.nextLine();
			}
			
		}
		
	}
}

package tipos;

import java.util.Scanner;

public class datos {
	
	public static void main(String[] args) {
		
		
		/*System.out.print("Ingresar Edad: ");
		Scanner sn = new Scanner(System.in);
		
		//Convertir de Texto a Entero
		int edad = sn.nextInt();
		
		System.out.print("Tu edad es: "+ edad);*/
		
		System.out.print("Ingresar Monto de Salario: ");
		Scanner sn2 = new Scanner(System.in);
		
		//Convertir de Texto a Entero
		double monto = sn2.nextDouble();
		
		double iva = 0.15;
		
		double resultado = monto * 0.15;
		
		double sueldoTotal = monto - resultado;
		
		
		System.out.println("Se a descontado tu salario al IEES: "+ resultado);
		System.out.println("Tu sueldo total es: "+ sueldoTotal);
		
		
		
		//int, char, string, boolean, float, double, long
		
		/*String nombre1 = "Juanito Perez";
		String nombre2 = "Claudia Shein";
		
		System.out.print("Los novios se van a casar:"+ nombre1 + " y "+ nombre2);
		*/
		
		/*int edad = 18;
		String edades;
		edades = String.valueOf(edad);
		
		System.out.print(edades);*/
		
		/*float num = 25.05F;
		System.out.println(num);
		
		double num2 = 56.87762;
		System.out.print(num2);
		
		boolean miembroVip = false;*/
		
		/*System.out.print("======================================\n");
		System.out.print("\tServicio de Tienda");
		System.out.print("======================================");
		System.out.print("1. Comprar");
		System.out.print("2. VerProductos");
		System.out.print("3. Inventario");
		System.out.print("4. Salir");
		System.out.print("Eliga una opcion: ");*/
		
		
		
		
		
		
	}
}

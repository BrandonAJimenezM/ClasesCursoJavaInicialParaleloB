package bucle;

import java.util.Scanner;

public class ejercicio2 {
	public static void main (String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		
		String nombres;
		int i =1;
		
		while(i<=5) { //1
			System.out.println("Ingrese Nombre: ");
			nombres = sc.nextLine();
			System.out.println(i++ +" Nombre es: "+nombres);
			
		}*/
		
		int num = 5;
		int i = 0;
		int suma = 0;
		while(i<=num) {
			System.out.println(suma+" + "+ i);
			suma = suma + i;
			System.out.println("Resultado de suma" + suma);
			i++;
		}
		
		System.out.println("\n\nLa suma Total es: "+ suma);
	
		
		
	}
}

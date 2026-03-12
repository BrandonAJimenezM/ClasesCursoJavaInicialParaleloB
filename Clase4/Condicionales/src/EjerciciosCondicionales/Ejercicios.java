package EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicios {
	
	public static void main(String[] args) {
		
		/*
		//Ejercicio1
		
		//Positivos negativos
		
		int num = 20;
		
		if(num>=0) {
			System.out.println("El numero es Positivo");	
		}else {
			System.out.println("El numero es Negativo");
		}
		*/
		/*
		//Ejercicio 2
		
		//Mayor o menor edades
		
		int edad = 15;
		
		if(edad >=18) { //1 - True
			System.out.println("Eres mayor de edad, puedes pasar");
		}else { // 0 - False
			System.out.println("Eres menos de edad, no puedes pasar");
		}*/
		
		/*
		//Ejercicio 3
		
		// IF - Else IF
		
		//Notas de aprobación
		// 14/20  - 20/20
		double notaFinal = 15;
		//[14,20]
		if(notaFinal >= 14 && notaFinal <=20) {
			System.out.println("Has Aprobado el Semestre");
		}else if(notaFinal >= 0 && notaFinal < 14) {
				System.out.println("Has Reprobado el Semestre");
			} else {
				System.out.println("El valor esta fuera del rango");
			}
		*/
		
		/*
		//Ejercicio 4
		
		//Pare e Impares
		
		int num = 16;
		
		//Multiplos 2
		
		if(num%4 == 0) {
			System.out.println("El numero es Par");
		}else {
			System.out.println("El numero es Impar");
		}
		
		*/
		
		//Ejercicio 5
		
		//Switch case 1, case 2, case3: break
		
		//Días de la semana
		//Lunes (1), Martes(2), Miercoles(3), Jueve(4), Viernes(5)
		//Sabado (6), Domingo(7)
/*
		int opcion = 7;
		
		switch(opcion) {
			case 1: 
				System.out.println("El día es Lunes");
				break;
			case 2:
				System.out.println("El día es Martes");
				break;
			case 3:
				System.out.println("El día es Miercoles");
				break;
			case 4:
				System.out.println("El día es Jueves");
				break;
			case 5:
				System.out.println("El día es Viernes");
				break;
			case 6:
				System.out.println("El día es Sabado");
				break;
			case 7:
				System.out.println("El día es Domingo");
				break;
			default: 
				System.out.println("El numero esta fuera del rango");
		}
		
		*/
		
		//Ejercicio 6
		
		//menu
		/*
		Scanner sc = new Scanner(System.in);
		
		int opc;
		
		System.out.println("\tServicio de Tienda");
		System.out.println("======================================");
		System.out.println("1. Comprar");
		System.out.println("2. VerProductos");
		System.out.println("3. Inventario");
		System.out.println("4. Salir");
		System.out.println("Eliga una opcion: ");
		
		opc = sc.nextInt();
		
		switch(opc) {
			case 1:
				System.out.print("Su compra a sido exitosa");
				break;
			case 2:
				System.out.print("Leche = 1 dolar"+"\n"
						+"arroz 1 libra = 0,75 centavos"
						);
				break;
			case 3:
				System.out.print("Leche = 50 especies"+"\n"
						+"Yogurt = 20 especies"
						);
				break;
			case 4:
				System.out.print("A salido del sistema, vuelva pronto");
				break;
			default: 
				System.out.print("La opcion ingresada no es válida");
		}
		*/
		
		//Ejercicio 7
		
		//Estaciones del año 4 meses
		
		
		//Otoño -> 9 Septiembre, 10 Octubre, 11 Noviembre
		//Invierno -> 12 Diciembre, 1 enero, 2febrero
		//Privamera ->3 Marzo, 4 Abril, 5 Mayo
		//Verano -> 6 Junio, 7 Julio, 8 Agosto
		
		/*
		Scanner sc = new Scanner(System.in);
		
		int opc = sc.nextInt();
		
		switch(opc) {
			case 12, 1, 2 -> System.out.print("Invierno");
			case 3, 4, 5 -> System.out.print("Primavera");
			case 6, 7, 8 -> System.out.print("Verano");
			case 9, 10, 11 -> System.out.print("Otoño");
			default -> System.out.print("No es ninguna estación");
		}
		*/
		
		//Ejercicio 8
		
		//char +,-,*,/
		
		/*
		int num = 10;
		int num2 = 2;
		
		//Sume (+)
		//Resta (-)
		//Multiplicación (*)
		//División (/)
		
		Scanner sc = new Scanner(System.in);
		
		//[5,4,2,1,0]
		//indices 0,1,2
		//A, B, C, +, -,*,/
		System.out.print("Ingrese un simbolo de operación");
		char opc = sc.next().charAt(0);
		
		
		switch(opc) {
			case '+' -> System.out.print(num+num2);
			case '-' -> System.out.print(num-num2);
			case '*' -> System.out.print(num*num2);
			case '/' -> System.out.print(num/num2);
			default -> System.out.print("No es ninguna operacion");
		}
		
		*/
		int cafe = 0;		
		
		// Condicion ? true : false
		String resultado = (cafe > 0) ? "Programador Feliz" : "El programador tiene sueño";
		
		System.out.print("El programador esta: "+resultado);
		
		
		
		
	}
	
}

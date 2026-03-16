package Ejercicio1;

import java.util.Scanner;

public class Futbolista {
	//Atributos
	String nombre;
	int numero;
	String posicionJuego;
	float estatura;
	
	//Métodos
	//Constructor
	public Futbolista () {
		this.nombre = "";
		this.numero = 0;
		this.posicionJuego = "";
		this.estatura = 0.0f;
	}
	
	public Futbolista (String nombre, int numero, String posicionJuego, float estatura) {
		this.nombre = nombre;
		this.numero = numero;
		this.posicionJuego = posicionJuego;
		this.estatura = estatura;
	}
	
	//Metodos de Usuario
	public void imprimirSaludo() {
		System.out.println("Hola, mi nombre es " + nombre);
		System.out.println("Soy un futbolista, uso el numero" + numero);
		System.out.println("Juego en la posición: " + posicionJuego);
		System.out.println("Mi estatura es: " + estatura);
	}
	
	//Método para ingreso de datos
	public void ingresarDatos() {
		Scanner sc = new Scanner(System.in);
		
		//Ingreso de nombre
		System.out.println("Ingrese el nombre: ");
		this.nombre = sc.nextLine();
		
		//Ingreso de numero
		System.out.println("Ingrese el número");
		this.numero = sc.nextInt();
		sc.nextLine();
		
		//Ingreso de posicionJuego
		System.out.println("Ingrese la posición del jugador");
		this.posicionJuego = sc.nextLine();
	}
}

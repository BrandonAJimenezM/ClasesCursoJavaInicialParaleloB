package practica;

import java.util.Scanner;

public class Personaje {
	//ATRIBUTOS
	private String nombre;
	private int fuerza;
	private int nivel;
	
	//CONSTRUCTOR POR DEFECTO
	public Personaje() {
		this.nombre = "Desconocido";
		this.fuerza = 5;
		this.nivel = 1;
	}
	
	//CONSTRUCTOR CON NOMBRE
	public Personaje(String nombre) {
		this.nombre = nombre;
		this.fuerza = 5;
		this.nivel = 1;
	}
	
	//CONSTRUCTOR COMPLETO
	public Personaje (String nombre, int fuerza, int nivel) {
		this.nombre = nombre;
		this.fuerza = fuerza;
		this.nivel = nivel;
	}
	
	//GETTERS
	public String getNombre() {
		return nombre;	
	}
	
	public int getFuerza() {
		return fuerza;
	}
	
	public int getNivel() {
		return nivel;
	}
	
	//SETTERS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setFuerza(int fuerza) {
		//Validar numero positivo
		if (fuerza > 0) {
			this.fuerza = fuerza;
		} else {
			System.out.println("No válido");
		}
	}
	
	public void setNivel (int nivel) {
		//Validar numero positivo
		if (nivel > 0) {
			this.nivel = nivel;
		} else {
			System.out.println("No válido");
		}
	}
	
	//METODOS DE USUARIO
	//METODO PARA SUBIR NIVEL DE PERSONAJE
	public void subirNivel () {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuantos niveles desea subir?");
		int nivelSuma = sc.nextInt();
		nivel = nivel + nivelSuma;
		//SUBIR FUERZA SEGUN NIVEL
		fuerza = fuerza + (5*nivelSuma);
		System.out.println("Nivel aumentado exitosamente");
	}
	
	//MOSTRAR ESTADO DE PERSONAJE
	public void mostrarEstado () {
		System.out.println("Estado de Personaje");
		System.out.println("Nombre: " + nombre);
		System.out.println("Fuerza: " + getFuerza());
		System.out.println("Nivel: " + getNivel());
	}
		
}

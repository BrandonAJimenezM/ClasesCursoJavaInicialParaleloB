package Ejercicio1;

public class Principal {
	
	//Metodo principal
	public static void main (String args[]) {
		int numero = 9;
		Futbolista jugador = new Futbolista("Messi", numero, "Extremo", 1.75f);
		jugador.ingresarDatos();
		jugador.imprimirSaludo();
		
	}
}

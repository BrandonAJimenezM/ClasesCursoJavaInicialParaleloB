package arreglos;

public class Personaje {

	String nombre;
	int vida;
	
	//Constructor 
	public Personaje (String nombre, int vida) {
		this.nombre =nombre;
		this.vida = vida;
	}
	
	 //Método para mostrar datos 
	public void mostrarDatos() {
		System.out.println("Personaje: " + nombre +" | Vida: " + vida);
	}
	
	
}

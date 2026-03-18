package practica;

public class Principal {
	//METODO PRINCIPAL
	public static void main(String[] args) {
		//CREAR OBJETOS
		Personaje caballero = new Personaje();
		Personaje maga = new Personaje ("Lux");
		Personaje herrero = new Personaje ("Diego", 25, 5);
		
		//GET NOMBRE
		System.out.println(caballero.getNombre());
	
		//SET NOMBRE
		caballero.setNombre("Jhon");
		System.out.println(caballero.getNombre());
		
		//VALIDACION SETTERS
		maga.setFuerza(-1);
		System.out.println(maga.getFuerza());
		
		//SUBIR NIVEL
		herrero.mostrarEstado();
		herrero.subirNivel();
		herrero.mostrarEstado();
		
		
		
	}
}

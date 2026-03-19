package arreglos;

public class MainP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" ====== Sistema de videojuego ======");
		
		//1. ARRAY UNIDIMENSIONAL  --->puntajes 
		int [] puntajes = {100, 200, 150, 300, 250}; //unidimensional -->una sola linea
		System.out.println("\nPuntajes del jugador");
		
		//recorrer con for 
		for (int i=0; i <puntajes.length; i++) {
			System.out.println("Nivel "+ (i+1)+ ": " + puntajes [i] + "puntos");
		}
		
		//Modificar puntaje -->mejorar en nivel 3
		puntajes [2] =500;
		System.out.println("\nPuntaje actualizado en el nivel 3:");
		System.out.println("Nivel 3:" + puntajes[2] + "puntos");
		
		//ARRAY DE STRING --->Jugadores
		String [] jugadores = {"Jhoana", "Alisson", "Jhonatan"};
		System.out.println("\nLista de jugadores");
		
		for (int i=0; i< jugadores.length; i++) {
			System.out.println("Jugador "+ (i+1)+ " : " + jugadores[i]);
		}
	
		//ARRAY BIDIMENSIONAL 
		//Matriz --> mapa del juega 
		//0 = libre, 1= obstáculo
		
		 int [][] mapa = {
				 {0, 1, 0},  //filas 
				 {0, 0, 1},
				 {1, 0, 0}
		 };
		 System.out.println("\nMapa del juego (0=libre, 1=obstáculo): ");
		
		 //recorrer matriz
		 for(int i=0; i< mapa.length; i++) {  //filas
			 for (int j=0; j< mapa[i].length; j++) {//columnas
				 System.out.println(mapa [i][j] + " "); 
			 }
			 System.out.println();
			 
		 }
		 
		 // ARRAY DE OBJETOS ----> PERSONAJES
		 
		 
		 Personaje [] personajes = new Personaje [3];
		 
		 personajes [0] = new Personaje ("Yoshi" , 100);
		 personajes [1] = new Personaje ("Peach" , 80);
		 personajes [2] = new Personaje ("Luigi" , 90);
		 
		 System.out.println("\nPersonajes del juego");
		 
		 for (int i =0; i < personajes.length; i++) {
			 personajes[i].mostrarDatos();
		 }
	}

}

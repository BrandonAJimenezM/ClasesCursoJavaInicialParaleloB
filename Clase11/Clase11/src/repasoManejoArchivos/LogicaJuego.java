package repasoManejoArchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LogicaJuego {

	
	//array
	private  Juego[] juegos;
	
	private static int cantidadJuegos; 
	private static final  int CAPACIDAD_MAXIMA = 5;
	private static final  String url = "C:\\RepositorioTexto\\reporteRanking.txt";
	
	
	
	// Definir capacidad maxima 
	public LogicaJuego() {
		juegos = new Juego[CAPACIDAD_MAXIMA];
		cantidadJuegos =0;
	}
	
	// registrar juego
	public  boolean registrarJuego(Juego juego) {
		
		if(cantidadJuegos >= CAPACIDAD_MAXIMA) {
			System.out.println("No se puede ingresar mas juegos");
			return false;
		}
		if(buscarJuego(juego.getName()) != null){
			System.out.println("Ese juego ya existe");
			return false;
		}

			// revisar
		/*
		 * Cuando escribes juegos[cantidadJuegos] = juego;, 
		 * le estás diciendo a Java: "Toma este nuevo objeto juego y guárdalo en el arreglo juegos,
		 *  exactamente en la posición que dicta el número cantidadJuegos".
		 */
			juegos[cantidadJuegos] = juego;
			cantidadJuegos ++;
			anexarTextoArchivo(juego);
			System.out.println("Juego agregado correctamente!");
			
			return true;
			
	}
	
	// buscar Juego
	private  Juego buscarJuego(String name) {
		
        for (int i = 0; i < cantidadJuegos; i++) {
            if (juegos[i].getName().equalsIgnoreCase(name)) {
                return juegos[i];
            }
        }
        return null;
    }
	
	// mostrar todos 
	
	public  void mostrarTodos() {
		if(cantidadJuegos == 0) { 
			System.out.println("No se ha agregado juegos aun!");
			return;
		}
		 for (int i = 0; i < cantidadJuegos; i++) {
			 System.out.println(juegos[i].toString());
		 }
	}

	// mostrar resumen 
	
	public void mostrarResumen() {
		
        if (cantidadJuegos == 0) {
            System.out.println("No hay datos para generar el resumen.");
            return;
        }
        
        int malo = 0, descente = 0, buenos = 0;
        
        for (int i = 0; i < cantidadJuegos; i++) {
            Juego est = juegos[i];          
            String estado = est.estado();
            
            if (estado.equals("MALO")) malo++;
            else if (estado.equals("DESCENTE")) descente++;
            else buenos++;
        }

        System.out.println("--- Resumen ---"); 
        System.out.println("Total de juegos: " + cantidadJuegos); 
        System.out.println("MALOS: " + malo); 
        System.out.println("Descente: " + descente); 
        System.out.println("BUENOS: " + buenos);
        
    }
	
	public  void crearArchivo() {
		
		File archivo = new File(url);
		// Que pasa si ya lo creamos ? 
		if(!archivo.exists()) {
		try {
			FileWriter entrada = new FileWriter(archivo);
			System.out.println("Archivo creado correctamente...!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}else {
			System.out.println("El archivo ya existe");
		}
	}
	
	
	public  void anexarTextoArchivo(Juego juego) {
		
		// Obtenemos la ruta, ESO SIEMPRE
		File archivo = new File(url);
		
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
				
				salida.println(juego.getName());
				salida.println(juego.getPuntaje());
			
			salida.close();
			System.out.println("Se ha escrito correctamente en el archivo! :D");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public  void leerArchivo() throws IOException {
			
			File archivo = new File(url);
			
			try {
				BufferedReader lector = new BufferedReader(new FileReader(archivo));
				String texto;
				texto = lector.readLine();
				
				while(texto!=null) {
					System.out.println(texto);
					texto = lector.readLine();
				}
				System.out.println("La accion se ha compleado con exito!");
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	
	
}

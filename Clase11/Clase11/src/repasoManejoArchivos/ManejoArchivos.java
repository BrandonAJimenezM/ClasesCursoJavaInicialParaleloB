package repasoManejoArchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// Clase encargada 
public class ManejoArchivos {
	
	// crear archivo / archivo 
	public static void crearArchivo(String ruta) {
		
		File archivo = new File(ruta);
		
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
	
	// insertarTexto / archivo
	public static void insertarTexto(String ruta, String textoUser) {
		
		// Obtenemos la ruta, ESO SIEMPRE
		File archivo = new File(ruta);
		
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo));
			
			salida.println(textoUser);
			salida.close();
			System.out.println("Se ha escrito correctamente en el archivo! :D");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	// leer archivo / archivo
	
	public static void leerArchivo(String ruta) throws IOException {
		
		File archivo = new File(ruta);
		
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
	
	// anexar texto / archivo 
	
	public static void anexarTextoArchivo(String ruta, String textoUser) {
			
			// Obtenemos la ruta, ESO SIEMPRE
			File archivo = new File(ruta);
			
			try {
				PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
				
				salida.println(textoUser);
				salida.close();
				System.out.println("Se ha escrito correctamente en el archivo! :D");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	

}

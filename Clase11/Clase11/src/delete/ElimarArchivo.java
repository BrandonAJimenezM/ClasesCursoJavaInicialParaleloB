package delete;

import java.io.File;

public class ElimarArchivo {
	public static void main(String[] args) {

        File archivo = new File("datos.txt");

        if (archivo.delete()) {
            System.out.println("Archivo eliminado");
        } else {
            System.out.println("No se pudo eliminar");
        }
    }
}

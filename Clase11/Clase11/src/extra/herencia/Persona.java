package extra.herencia;

public class Persona {
	String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toString() {
        return "Memoria: "+super.toString() +"\nNombre: " + nombre + " Edad: " + edad;
    }
}

package extra.herencia;

public class Estudiante extends Persona{

	String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString() + " Carrera: " + carrera;
    }
	

}

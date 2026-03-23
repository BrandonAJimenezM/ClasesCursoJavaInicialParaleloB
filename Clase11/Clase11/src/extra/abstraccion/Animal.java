package extra.abstraccion;

public abstract class Animal {
	String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void hacerSonido();

    public String toString() {
        return "Animal: " + nombre;
    }
}

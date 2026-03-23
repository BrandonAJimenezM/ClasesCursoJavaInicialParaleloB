package extra.Liskov;

public class Aguila extends Ave implements Volador {
	
	public Aguila(String nombre) {
		super(nombre);
	}
    public void volar() {
        System.out.println("Vuela alto");
    }
}

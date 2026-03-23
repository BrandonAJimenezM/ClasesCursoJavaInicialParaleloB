package extra.abstraccion;

public class Gato extends Animal {

    public Gato(String nombre) {
        super(nombre);
    }

    public void hacerSonido() {
        System.out.println("Maulla");
    }
}

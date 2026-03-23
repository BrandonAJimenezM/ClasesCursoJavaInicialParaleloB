package extra.ejecucion;

import extra.abstraccion.*;

public class Main {
	public static void main(String[] args) {

        Animal a1 = new Perro("Firulais");
        Animal a2 = new Gato("Michi");

        a1.hacerSonido();
        a2.hacerSonido();

        System.out.println(a1);
        System.out.println(a2);
    }
}

package extra.Interface;

import extra.abstraccion.*; 

public class Pajaro extends Animal implements Volador {

    public Pajaro(String nombre) {
        super(nombre);
    }
    
    public void hacerSonido() {
        System.out.println("Canta");
    }

    public void volar() {
        System.out.println("Está volando");
    }
}
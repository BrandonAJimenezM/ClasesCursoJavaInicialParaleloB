package extra.Liskov;

public class Liskov {
	public static void main(String[] args) {
		//Las subclases deben ser sustituibles 
		//por sus clases base sin alterar el 
		//funcionamiento del programa.
		
		Ave ave = new Aguila("Aguila Calva");
		System.out.println(ave.nombre);
		
		
		Aguila ag1 = (Aguila) ave;
		ag1.volar();
		
		Volador v1 = new Aguila("Aguila Calva");
		System.out.println("Acción");
		v1.volar();
	}
}
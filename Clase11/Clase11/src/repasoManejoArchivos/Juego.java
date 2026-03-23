package repasoManejoArchivos;

public class Juego {
	
	private String name;
	private int puntaje; 
	
	public Juego(String name, int puntaje) {
		this.name = name;
		this.puntaje = puntaje;
	}
	
	//Getters 
	public String getName() {return name;}
	public int getPuntaje() {	return puntaje;}
	
	
	public String estado() {
		if(puntaje >= 0 && puntaje <=4) {
			return "MALO";
		}else if(puntaje >= 5 && puntaje <= 7) {
			return "DESCENTE";
		}else {
			return "BUENO";
		}
	}

	
	@Override
	public String toString() {
		return "Juego [name =" + name + ", puntaje= " + puntaje + " estado= " +estado()+ "]";
	}
	
	
	
}

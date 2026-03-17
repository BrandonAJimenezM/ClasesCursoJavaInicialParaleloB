package progra1;

public class Producto {

	//ATRIBUTOS 
	
	private String nombre;
	private double precio;
	private int cantidad;
	
	//Constructor 
	public Producto(String nombre, double precio, int cantidad) {
		this.nombre = nombre;
		this.precio = precio; 
		this.cantidad = cantidad;
	}
	
	//Metodos
	public void mostrarDatos() {
		System.out.println("Producto: " +nombre);
		System.out.println("Precio: " +precio);
		System.out.println("Cantidad: " +cantidad);
	}
	
	//Método con parámetros
	
	public void cambiarPrecio(double nuevoPrecio) {
		precio = nuevoPrecio;
	}
	
	//Método con valor retorno
	
	public double calcularTotal() {
		double total = precio * cantidad;
		return total;
	}
	
}

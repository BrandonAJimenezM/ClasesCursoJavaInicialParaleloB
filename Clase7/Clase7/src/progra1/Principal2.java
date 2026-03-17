package progra1;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CREAR EL OBJETO
		
		Producto p1 = new Producto("Laptop", 400, 2);
		
		//Mostrar datos
		p1.mostrarDatos();
		
		//Cambiar precio --> metodo con parametros
		p1.cambiarPrecio(500);
		System.out.print("Precio actalizado ");
		
		//Metodo con retorno
		
		double total = p1.calcularTotal();
		System.out.print("Total a pagar: " +total);
		
	}

}

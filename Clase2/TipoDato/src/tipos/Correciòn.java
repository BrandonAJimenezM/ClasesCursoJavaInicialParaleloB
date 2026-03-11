package tipos;

public class Correciòn {
	public static void main() {
		/*
		//Dato Long
		
		long idCodigo = 10009438738L;
		long año = 2000;
		
		System.out.println("Id de usuario: "+idCodigo);
		System.out.println("Año: "+año);
		
		
				
		//Conversion de Long a int
		
		int usuario = (int) idCodigo;
		int periodo = (int) año; 
		
		System.out.println("El id del usuario es: "+ usuario);
		System.out.println("El año del Periodo I es: "+ periodo);
		
		
		//Conversion de int a Long
		
		int numLibro= 500000000;
		
		long idLibro = (long) numLibro;
		
		System.out.println("El numero de edicion de libro es: "+idLibro);
		
		*/
		/*
		//Convertir texto a int
		
		String telefono = "454212156";
		int numero = Integer.parseInt(telefono);
		double numero2 = Double.parseDouble(telefono);
		
		System.out.println("Numero entero: "+numero);
		System.out.println("Numero double: "+numero2);
		
		String cadena = String.valueOf(numero2);
		System.out.println("numero de cadena: "+numero2);
		
		System.out.println(numero + numero2);
		*/
		/*
		//Presición de flotantes
		
		//Redondeo
		double monto = 50000.47667676;
		
		System.out.printf("Saldo de cliente: %.2f ", monto);
		
		//Truncamiento
		double millas = 300.3746881;
		
		System.out.printf("\nSaldo de cliente: %.2f ", millas);
		
		*/
		/*IVA y Contribución al IESS
		 * Iva = 15%  - > 0.15
		 * IESS = 9.45%  -> 0.0945
		 */
		
		final double IESS = 0.0945;
		
		final double IVA = 0.15;
		
		double compraSupermaxi = 500;
		double compraSupermaxiIVA = compraSupermaxi * IVA;
		
		double compraTotal = compraSupermaxi + compraSupermaxiIVA;
		
		System.out.println("\n\n\n\t Sistema de Compras de Productos\n");
		
		System.out.println("\nCompra Total en Productos: "+compraSupermaxi+"\n"
				+"Impuesto total en compra: "+compraSupermaxiIVA+"\n"
				+"Precio Total a pagar: "+compraTotal
				
				);

		
		
		
		
		
		
	}
	
	
}

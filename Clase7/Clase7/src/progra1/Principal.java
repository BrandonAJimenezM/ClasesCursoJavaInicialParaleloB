package progra1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" ==== SISTEMA BANCARIO === ");
		
		System.out.println("Ingrese el nombre del titular");
		String nombre = sc.nextLine();
		
		System.out.println("Ingrese el numero de cuenta");
		String cuenta = sc.nextLine();
		
		System.out.println("Ingrese saldo inicial");
		double saldoInicial = sc.nextDouble();
		
		//CREACER EL OBJETO ---> constructor 
  CuentaBancaria   cuenta1             = new              CuentaBancaria(nombre, cuenta, saldoInicial);
  //   tipo         nombre dle objeto   crear el objeto    constructor 
		
        System.out.println("\nCuneta creada correctamente\n");
		
		//LAMAR A NUESTROS METODOS
        
        cuenta1.mostrarDatos();
        
        System.out.println("\nIngrese la cantidad a depositar:");
        double deposito = sc.nextDouble();
        cuenta1.depositar(deposito);
        
        System.out.println("\nIngrese la cantidad a retirar:");
        double retiro = sc.nextDouble();
        boolean resultado = cuenta1.retirar(retiro);
		   if (resultado) {
			   System.out.println("Retiro realizado con éxito");  
		   }else {
			   System.out.println("UPS saldo insuficiente");
		   }
        
		   System.out.println("\nSaldo final: " + cuenta1.consultarSaldo());
		
		
	}
	}	

//  \n   System.out.println()
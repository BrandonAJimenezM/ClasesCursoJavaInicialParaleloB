package progra1;

public class CuentaBancaria {

	    // =========================
	    // ATRIBUTOS (ENCAPSULADOS)
	    // =========================

	    private String titular;
	    private String numeroCuenta;
	    private double saldo;
	
	
    
	    // =========================
	    // CONSTRUCTOR
	    // =========================

	     public CuentaBancaria(String titular, String numeroCuenta, double saldoInicial) {
	    	 this.titular = titular;
	    	 this.numeroCuenta =numeroCuenta;
	    	 this.saldo = saldoInicial;
	     }
	
	    // =========================
	    // MÉTODO CON PARÁMETROS
	    // =========================

	      public void depositar(double cantidad) {
	    	  saldo = saldo + cantidad;
	    			  System.out.println("Depósito reaizado correctamente");	  
	      }
	

	    // =========================
	    // MÉTODO CON PARÁMETROS Y VALIDACIÓN
	    // =========================

	       public boolean retirar (double cantidad) {
	    	   if (cantidad <= saldo ) {
	    		   saldo = saldo - cantidad; 
	    		   return true;
	    	   }else {
	    		   return false;
	    	   }
	       }
	
	    // =========================
	    // MÉTODO CON VALOR DE RETORNO
	    // =========================

	    public double consultarSaldo () {
	    	return saldo;
	    	
	    	
	    }
	
	
	    // =========================
	    // MÉTODO PARA MOSTRAR DATOS
	    // =========================

	    public void mostrarDatos() {
	    	System.out.println("Titular: " + titular);
	    	System.out.println("Numero de cuenta: " + numeroCuenta);
	    	System.out.println("Saldo actual: " + saldo);
	    }
	
}

package operadoresAritmeticos;

import java.util.Scanner;

public class ClaseOperadores {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ==========================================
        // 1. OPERADORES ARITMÉTICOS (+, -, *, /, %)
        // ==========================================
        System.out.println("--- 1. Operadores Aritméticos ---");
        
        System.out.print("Ingrese la base (a): ");
        double a = sc.nextDouble();
        System.out.print("Ingrese el exponente o divisor (b): ");
        double b = sc.nextDouble();

        // Operaciones básicas
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        
        // Uso de Math para potencias y raíces
        double potencia = Math.pow(a, b); // a elevado a b
        double raiz = Math.sqrt(a);       // Raíz cuadrada de a
        
        System.out.println(a + " elevado a " + b + " es: " + potencia);
        System.out.println("La raíz cuadrada de " + a + " es: " + raiz);

        // ------------------------------------------
        // 1.1 - Uso del módulo % (Residuo de la división)
        // ------------------------------------------
        System.out.println("\n--- 1.1 Uso del Módulo (%) ---");
        System.out.print("Ingrese un número para saber si es par: ");
        int numParCheck = sc.nextInt();
        
        if (numParCheck % 2 == 0) {
            System.out.println(numParCheck + " es PAR (el residuo es 0).");
        } else {
            System.out.println(numParCheck + " es IMPAR (el residuo no es 0).");
        }

        // ------------------------------------------
        // 1.2 Expresiones Complejas y Atajos
        // ------------------------------------------
        System.out.println("\n--- 1.2 Expresiones y Tips ---");
        
        // Expresión: (a/b) + 1
        double expresion = (a / b) + 1;
        System.out.println("Resultado de (" + a + "/" + b + ") + 1 es: " + expresion);

        // Tip: Incremento y Decremento
        int c = 10;
        System.out.println("Valor inicial de c: " + c);
        c++; // c = c + 1
        System.out.println("Después de c++: " + c);
        c--; // c = c - 1
        System.out.println("Después de c--: " + c);

        // Ejemplo Pitágoras: c^2 = a^2 + b^2 -> c = √(a^2 + b^2)
        double hipotenusa = Math.sqrt(Math.pow(3, 2) + Math.pow(4, 2));
        System.out.println("Hipotenusa de un triángulo (3, 4): " + hipotenusa);

        // ==========================================
        // 2. OPERADORES RELACIONALES (Comparación)
        // ==========================================
        System.out.println("\n--- 2. Operadores Relacionales ---");
        // Devuelven un valor booleano (true/false)
        System.out.println(a + " > " + b + " : " + (a > b));    // Mayor que
        System.out.println(a + " < " + b + " : " + (a < b));    // Menor que
        System.out.println(a + " == " + b + " : " + (a == b));  // Igual a
        System.out.println(a + " != " + b + " : " + (a != b));  // Diferente de

        // ==========================================
        // 3. OPERADORES LÓGICOS (AND, OR, NOT)
        // ==========================================
        System.out.println("\n--- 3. Operadores Lógicos ---");
        
        boolean esMayorDeEdad = true;
        boolean tieneEntrada = false;

        // && (AND): Ambas deben ser verdaderas
        System.out.println("¿Puede entrar al concierto? (&&): " + (esMayorDeEdad && tieneEntrada));

        // || (OR): Al menos una debe ser verdadera
        System.out.println("¿Es mayor de edad O tiene entrada? (||): " + (esMayorDeEdad || tieneEntrada));

        // ! (NOT): Invierte el valor
        boolean esImpar = !(9 % 2 == 0); 
        System.out.println("¿9 es impar? (Usando ! para negar): " + esImpar);

        if (!tieneEntrada) {
            System.out.println("Mensaje: No puedes pasar porque NO tienes entrada.");
        }
        
        sc.close(); // Buena práctica cerrar el Scanner
        System.out.println("\n--- Fin de la Clase ---");
    }
}

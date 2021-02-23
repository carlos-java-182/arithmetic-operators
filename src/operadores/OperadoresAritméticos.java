package operadores;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class OperadoresAritméticos {

	public static void main(String[] args) {
		
		
				/* Práctica de operadores*/
		
		
		Scanner entrada = new Scanner(System.in);
		float numero1, numero2, suma, resta, multiplicación, división, resto;
		
		System.out.println("Digita dos números: " );
		numero1 = entrada.nextFloat();
		numero2 = entrada.nextFloat();
		
		suma = numero1 + numero2;
		resta= numero1 - numero2;
		multiplicación = numero1 * numero2;
		división = numero1/numero2;
		resto = numero1%numero2;
		
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La multiplicación es: " + multiplicación);
		System.out.println("La división es: " + división);
		System.out.println("El resto es: " + resto);
		
			
			//Clase Math
		
		
		double raíz = Math.sqrt(8);
		System.out.println("La raíz es: " + raíz);
		
		
		double base = 5, exponente = 5;
		double resultado = Math.pow(base, exponente);
		System.out.println("El exponente es: " + resultado);
		
		
		double redondeo = Math.round(raíz);
		System.out.println("El redondeo de la raíz es: " + redondeo);
		
		
		double random = Math.random();
		System.out.println("El número random es: " + random);
		
		
		
		
		
		
		
		
		
		
	}

}

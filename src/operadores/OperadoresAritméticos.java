package operadores;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class OperadoresAritm�ticos {

	public static void main(String[] args) {
		
		
				/* Pr�ctica de operadores*/
		
		
		Scanner entrada = new Scanner(System.in);
		float numero1, numero2, suma, resta, multiplicaci�n, divisi�n, resto;
		
		System.out.println("Digita dos n�meros: " );
		numero1 = entrada.nextFloat();
		numero2 = entrada.nextFloat();
		
		suma = numero1 + numero2;
		resta= numero1 - numero2;
		multiplicaci�n = numero1 * numero2;
		divisi�n = numero1/numero2;
		resto = numero1%numero2;
		
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La multiplicaci�n es: " + multiplicaci�n);
		System.out.println("La divisi�n es: " + divisi�n);
		System.out.println("El resto es: " + resto);
		
			
			//Clase Math
		
		
		double ra�z = Math.sqrt(8);
		System.out.println("La ra�z es: " + ra�z);
		
		
		double base = 5, exponente = 5;
		double resultado = Math.pow(base, exponente);
		System.out.println("El exponente es: " + resultado);
		
		
		double redondeo = Math.round(ra�z);
		System.out.println("El redondeo de la ra�z es: " + redondeo);
		
		
		double random = Math.random();
		System.out.println("El n�mero random es: " + random);
		
		
		
		
		
		
		
		
		
		
	}

}

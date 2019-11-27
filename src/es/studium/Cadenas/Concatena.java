package es.studium.Cadenas;

import java.util.Scanner;

public class Concatena {

	public static void main(String[] args) 
	{
		String cadena1, cadena2, cadena3;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame una cadena:");
		cadena1 = teclado.next();
		
		System.out.println("Dame otra cadena:");
		cadena2 = teclado.next();
		
		cadena3 = cadena1+" "+cadena2;
		
		//dos forma de hacerlo
		System.out.println(cadena3);
		
		System.out.println(String.format("La cadena \"%s\" concatenada con la cadena \"%s\" resulta \"%s\"",cadena1,cadena2,cadena3));
		
		teclado.close();

	}

}

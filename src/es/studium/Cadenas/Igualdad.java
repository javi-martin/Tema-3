package es.studium.Cadenas;

import java.util.Scanner;

public class Igualdad {

	public static void main(String[] args) 
	{
		String cadena1, cadena2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame una cadena:");
		cadena1 = teclado.next();
		
		System.out.println("Dame otra cadena:");
		cadena2 = teclado.next();
		
		teclado.close();
		
		if(cadena1.equals(cadena2))
		{
			System.out.println("Las cadenas son iguales");
		}
		else 
		{
			System.out.println("Las cadenas no son iguales");
		}
	}

}

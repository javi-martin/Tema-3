package es.studium.Cadenas;

import java.util.Scanner;

public class Mayusculas_Minusculas {
	
	public static void main(String[] args) 
	{
		String cadena;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame una cadena:");
		cadena = teclado.next();
		
		System.out.println("Mayúsculas: "+cadena.toUpperCase());
		
		System.out.println("Minúsculas: "+cadena.toLowerCase());
		
		teclado.close();
	}

}

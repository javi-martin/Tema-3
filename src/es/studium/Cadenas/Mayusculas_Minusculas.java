package es.studium.Cadenas;

import java.util.Scanner;

public class Mayusculas_Minusculas {
	
	public static void main(String[] args) 
	{
		String cadena;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame una cadena:");
		cadena = teclado.next();
		
		System.out.println("May�sculas: "+cadena.toUpperCase());
		
		System.out.println("Min�sculas: "+cadena.toLowerCase());
		
		teclado.close();
	}

}

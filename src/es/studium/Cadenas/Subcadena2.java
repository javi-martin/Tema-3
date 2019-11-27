package es.studium.Cadenas;

import java.util.Scanner;

public class Subcadena2 {

	public static void main(String[] args)
	{
		String cadena;
		int posicion, aux;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame una cadena:");
		cadena = teclado.next();
		
		System.out.println("Indique una posiciónen la que comienza la subcadena(>0):");
		posicion = teclado.nextInt();
		
		aux = cadena.length() - posicion;
		System.out.println(cadena.substring(aux, cadena.length()));
		
		teclado.close();

	}

}

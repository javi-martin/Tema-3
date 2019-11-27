package es.studium.Cadenas;

import java.util.Scanner;

public class Subcadena {

	public static void main(String[] args)
	{
		String cadena;
		int posicion, longitud, aux;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame una cadena:");
		cadena = teclado.next();
		
		System.out.println("Indique una posiciónen la que comienza la subcadena(>0):");
		posicion = teclado.nextInt();
		
		aux=cadena.length();
		
		System.out.println("Indique la longitud de la subcadena (<"+aux+")");
		longitud = teclado.nextInt();
		
		System.out.println(subcadena (cadena, posicion, longitud));
		
		teclado.close();
		

	}
	
	public static String subcadena(String cadena, int posIni, int login) 
	{
		
		return (cadena.substring(posIni -1, (posIni+login -1)));		
	}

}

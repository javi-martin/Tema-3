package es.studium.Cadenas;

import java.util.Scanner;

public class ContarVocales {

	public static void main(String[] args) 
	{
		String cadena;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame una cadena:");
		cadena = teclado.nextLine();
		
		teclado.close();
		
		System.out.println("El número de vocales es:"+contarVocales(cadena));
		System.out.println("El número de vocales es:"+contarVocales2(cadena));

	}
	
	public static int contarVocales(String cadena) 
	{
		int contador=0;
				
		for(int i=0; i<cadena.length(); i++) 
		{
			if((cadena.charAt(i)=='a') || (cadena.charAt(i)=='e') || 			(cadena.charAt(i)=='i') || (cadena.charAt(i)=='o') || 			(cadena.charAt(i)=='u')) 
			{
				contador++;//esto es igual a contador=contador+1
			}
		}
		return(contador);
	}
	
	public static int contarVocales2(String cadena) 
	{
		String vocales= "aeiouAEIOUáéíóú";
		int contador=0;
		boolean constante;
		for(int i=0; i<cadena.length(); i++) 
		{
			constante=true;
			for(int j=0; j<vocales.length(); j++) 
			{
				if(vocales.charAt(j)==cadena.charAt(i)) 
				{
					contador++;
					constante=false;
				}
			}
		}
		return(contador);
		
	}
	

}

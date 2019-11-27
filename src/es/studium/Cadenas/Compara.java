package es.studium.Cadenas;

import java.util.Scanner;

public class Compara {

	public static void main(String[] args)
	{
		String cadena1, cadena2;
				
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame una cadena:");
		cadena1 = teclado.next();
		
		System.out.println("Dame otra cadena:");
		cadena2 = teclado.next();
		
		if(cadena1.length()==cadena2.length()) 
		{
			System.out.println("Son iguales");
		}
		else if(cadena1.length()<cadena2.length()) 
			{
				System.out.println("La cadena1 es la más pequeña:");
			}
			else
			{
				System.out.println("La cadena2 es la más pequeña");
			}
		
		teclado.close();

	}

}

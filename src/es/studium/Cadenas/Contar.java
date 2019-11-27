package es.studium.Cadenas;

import java.util.Scanner;

public class Contar {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		String texto;
		int numLetras=0;
		
		System.out.println("Escriba un texto:");
		texto = teclado.nextLine();
		
		teclado.close();
		
		texto = texto.replaceAll(" ", "");
		
		for(int i=0; i<texto.length(); i++) 
		{
			if(texto.charAt(i)!=' ')
			{
				numLetras++;
				
			}
		}
		
		System.out.println(numLetras);

	}

}

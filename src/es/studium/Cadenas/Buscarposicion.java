package es.studium.Cadenas;

import java.util.Scanner;

public class Buscarposicion {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		String frase;
		char x;
		int posicion = -1;
		
		System.out.println("Indique una frase:");
		frase = teclado.nextLine();
		
		System.out.println("Indique un caracter de la frase:");
		x = teclado.next().charAt(0);
		
				
		for(int i=0; i<frase.length(); i++) 
		{
			if(frase.charAt(i)==x) 
			{
				posicion = i;
				i = frase.length();
			}
		}
		if(posicion == -1)
		{
			System.out.println("No encontrado");
		}
		else
		{
			System.out.println("Se ha encontrado en la posicion: "+(posicion + 1));
		}
		
		teclado.close();
		
	}

}

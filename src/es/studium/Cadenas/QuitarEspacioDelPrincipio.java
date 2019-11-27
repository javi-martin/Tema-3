package es.studium.Cadenas;

import java.util.Scanner;

public class QuitarEspacioDelPrincipio {

	public static void main(String[] args)
	{
		String cadena1, cadena2;
		boolean espacio=false;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame una cadena:");
		cadena1 = teclado.nextLine();
		
		teclado.close();
		
		cadena2=cadena1.trim();
		
		System.out.println(cadena2);
		
		espacio=false;
		cadena2="";
		for(int i=0; i<cadena1.length(); i++) 
		{
			if(!espacio)
			{
				if(cadena1.charAt(i)!= ' ') 
				{
					espacio = true;
					cadena2 = cadena2 + cadena1.charAt(i);
					System.out.println(cadena2);
				}
			}
			else 
			{
				cadena2 += cadena1.charAt(i);
				System.out.println(cadena2);
			}
				
		}
		
		
		
		for(int j=0; j<cadena1.length(); j++) 
		{
			
		}

	}

}

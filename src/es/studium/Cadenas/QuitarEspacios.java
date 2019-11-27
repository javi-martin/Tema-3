package es.studium.Cadenas;

import java.util.Scanner;

public class QuitarEspacios {

	public static void main(String[] args) 
	{
		String cadena, cadenaSinEspacio="";
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame una cadena:");
		cadena = teclado.nextLine();
		
		teclado.close();
		
		for(int i=0; i<cadena.length(); i++) 
		{
			if(cadena.charAt(i)!=' ') 
			{
				cadenaSinEspacio = cadenaSinEspacio + cadena.charAt(i);
			}
		}
		
		System.out.println(cadenaSinEspacio);
		
		
		cadenaSinEspacio = cadena.replaceAll(" ", "");
		System.out.println(cadenaSinEspacio);
		
		

	}

}

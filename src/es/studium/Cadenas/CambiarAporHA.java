package es.studium.Cadenas;

import java.util.Scanner;

public class CambiarAporHA {

	public static void main(String[] args) 
	{
		String cadena1, cadena2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame una cadena:");
		cadena1 = teclado.nextLine();
		
		teclado.close();
		
		cadena2=cadena1.replaceAll("a", "ha");
		System.out.println(cadena2);

	}

}

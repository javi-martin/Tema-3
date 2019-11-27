package es.studium.Cadenas;

import java.util.Scanner;

public class Comparar {

	public static void main(String[] args) 
	{
		String palabla1, palabla2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame una palabra:");
		palabla1 = teclado.next();
		
		System.out.println("Dame otra palabra:");
		palabla2 = teclado.next();
		
		teclado.close();
		
		System.out.print("Las palablas ordenadas: "+ordenalfabetico(palabla1, palabla2));
		
	;

	}
	
	public static String ordenalfabetico(String palabla1, String palabla2) 
	{
		String palablasOrdenadas = "";
		
		if(palabla1.compareTo(palabla2)>0) 
		{
			palablasOrdenadas = palabla2 + ", " + palabla1;
		}
		else 
		{
			palablasOrdenadas = palabla1 + ", " + palabla2;
		}
		
		return(palablasOrdenadas);
	}

}

package Tablas;

import java.util.Scanner;

public class RellenarTabla3 {

	public static void main(String[] args) 
	{
		int tabla[] = new int[4];
		int i;
		Scanner teclado = new Scanner(System.in);
		
		for(i=0; i<4; i++)
		{
			System.out.println("Ingrese el valor de la posición "+i+":");
			tabla[i] = teclado.nextInt();
		}
		for(i=3; i>=0; i--) 
		{
			System.out.println(tabla[i]);
		}
		
		teclado.close();

	}

}

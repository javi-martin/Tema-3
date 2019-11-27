package Tablas;

import java.util.Scanner;

public class Cuadrados {

	public static void main(String[] args)
	{
		int numero;
		int tabla[]= new int[10];
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Indique un número entero");
		numero = teclado.nextInt();
		teclado.close();
		
		for(int i=0; i<10; i++) 
		{
			numero=numero+1;
			tabla[i]=numero*numero;
		}
		for(int i=0; i<10; i++) 
		{
			System.out.print(tabla[i]+" ");
		}

	}

}

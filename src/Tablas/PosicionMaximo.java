package Tablas;

import java.util.Scanner;

public class PosicionMaximo {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		final int TAM=10;
		int tabla[]= new int[TAM];
		int maximo;
		
		
		for(int i=0; i<TAM; i++) 
		{
			System.out.println("Ingrese el valor de la posición "+i+":");
			tabla[i] = teclado.nextInt();
		}
		
		maximo=tabla[0];
		
		for(int i=0; i<TAM; i++) 
		{
			System.out.println(tabla[i]);
			
			if(tabla[i]>maximo) 
			{
				maximo=tabla[i];
			}
		}
		
		System.out.println("El número máximo de los indicados es: " + maximo);
		
		for(int i=0; i<TAM; i++) 
		{
			if(tabla[i]==maximo) 
			{
				System.out.println(i);
			}
		}
		
		teclado.close();
		

	}
	
}

package Tablas;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) 
	{
		int numero;
		final int TAM=2;
		int contador[]= new int[TAM];
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0; i<2; i++) 
		{
			contador[i]=0;
		}
			
		do 
		{
			System.out.println("Dame un número entero:");
			numero = teclado.nextInt();
			if(numero>0) 
			{
				contador[0]=contador[0]+1;
			}
			
			if(numero<0) 
			{
				contador[1]=contador[1]+1;
			}			
			
		}while(numero!=0);
		System.out.println("El número de valores positivos es:"+contador[0]);
		System.out.println("El número de valores negativos es:"+contador[1]);	
		teclado.close();
		
	}

}

package Tablas;

import java.util.Scanner;

public class MaximoMinimoMedia {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		final int TAM=10;
		int tabla[]= new int[TAM];
		int suma=0;
		int maximo, minimo;
		
		for(int i=0; i<TAM; i++) 
		{
			tabla[i]=0;
		}
		
		
		for(int i=0; i<TAM; i++) 
		{
			System.out.println("Ingrese el valor de la posición "+i+":");
			tabla[i] = teclado.nextInt();
		}
		
		maximo=tabla[0];
		minimo=tabla[0];
		
		for(int i=0; i<TAM; i++) 
		{
			System.out.println(tabla[i]);
			suma=suma+tabla[i];
			if(tabla[i]>maximo) 
			{
				maximo=tabla[i];
			}
			if(tabla[i]<minimo) 
			{
				minimo=tabla[i];
			}
		}
		
		System.out.println("La media es: "+ (float)(suma/10));
		System.out.println("El máximo es: "+ maximo);
		System.out.println("El mínimo es: "+ minimo);
		
		teclado.close();
		
	}

}

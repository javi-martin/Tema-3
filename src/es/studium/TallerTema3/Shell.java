package es.studium.TallerTema3;

import java.util.Scanner;

public class Shell {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		final int TAM=10;
		int tabla[] = new int [TAM];
		int salto, aux, i;
		boolean cambios;
		
		for(i=0; i<=TAM-1; i++) 
		{
			System.out.println("Dame un número entero:");
			tabla[i] = teclado.nextInt();
		}
		for(salto=TAM/2; salto!=0; salto=salto/2) 
		{
			cambios=true;
			while(cambios==true)
			{
				cambios=false;
				for(i=salto; i<TAM; i++) 
				{
					if(tabla[i-salto]>tabla[i]) 
					{
						aux=tabla[i];
						tabla[i]=tabla[i-salto];
						tabla[i-salto]=aux;
						cambios=true;
					}
				}
			}
		}
		System.out.println("La tabla ordenada que así:");
		for(i=0; i<TAM; i++) 
		{
			System.out.print(tabla[i]);
		}
		
		teclado.close();

	}

}

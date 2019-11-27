package es.studium.TallerTema3;

import java.util.Scanner;

public class OrdenarSeleccion {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int tabla[] = new int[10];
		int i, j, aux, indice_menor;
		
		for(i=0; i<10; i++) 
		{
			System.out.println("Dame un número entero:");
			tabla[i] = teclado.nextInt();
		}
		for(i=0; i<=8; i++) 
		{
			indice_menor=i;
			for(j=i+1; j<10; j++) 
			{
				if(tabla[j]<tabla[indice_menor]) 
				{
					indice_menor=j;
				}
			}
			aux=tabla[i];
			tabla[i]=tabla[indice_menor];
			tabla[indice_menor]=aux;
		}
		System.out.println("La tabla ordenada que así:");
		for(i=0; i<10; i++) 
		{
			System.out.print(tabla[i]);
		}
		
		teclado.close();


	}

}

package es.studium.TallerTema3;

import java.util.Scanner;

public class OrdenarBurbuja {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int tabla[] = new int[10];
		int i, j, aux;
		
		for(i=0; i<10; i++) 
		{
			System.out.println("Dame un número entero:");
			tabla[i] = teclado.nextInt();
		}
		for(i=0; i<=8; i++) 
		{
			for(j=0; j<10-i-1; j++) 
			{
				if(tabla[j]>tabla[j+1]) 
				{
					aux=tabla[j];
					tabla[j]=tabla[j+1];
					tabla[j+1]=aux;
				}
			}
		}
		System.out.println("La tabla ordenada que así:");
		for(i=0; i<10; i++) 
		{
			System.out.print(tabla[i]);
		}
		
		teclado.close();


	}

}

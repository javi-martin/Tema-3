package es.studium.TallerTema3;

import java.util.Scanner;

public class OrdenarInsercion {

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
		for(i=0; i<=9; i++) 
		{
			j=i;
			aux=tabla[i];
			while(j>0 && aux<tabla[j-1]) 
			{
				tabla[j]=tabla[j-1];
				j=j-1;
			}
			tabla[j]=aux;
		}
		System.out.println("La tabla ordenada que así:");
		for(i=0; i<10; i++) 
		{
			System.out.print(tabla[i]);
		}
		
		teclado.close();


	}

}

package Tablas;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int tabla1 [][] = new int [3][3];
		int tabla2 [][] = new int [3][3];
		int suma [][] = new int [3][3];
		
		System.out.println("Introducir tabla1");
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) 
			{
				System.out.println("Valor de "+i+"-"+j);
				tabla1[i][j] = teclado.nextInt();
			}
		}
		System.out.println("Introducir tabla2");
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) 
			{
				System.out.println("Valor de "+i+"-"+j);
				tabla2[i][j] = teclado.nextInt();
			}
		}
		System.out.println("La suma de los valores de tabla1 y tabla2 es:");				
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) 
			{
				suma[i][j]=tabla1[i][j]+tabla2[i][j];
			}
		}
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) 
			{
				System.out.print(""+suma[i][j]);
			}
			System.out.println("");
		}
		
		teclado.close();


	}

}

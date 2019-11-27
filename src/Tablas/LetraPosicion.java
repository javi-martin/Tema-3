package Tablas;

import java.util.Scanner;

public class LetraPosicion {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		char tabla1 [][] = new char[3][3];
		int tabla2 [][] = new int [3][3];
		
		System.out.println("Introducir tabla");
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) 
			{
				System.out.println("Valor de "+i+"-"+j);
				tabla1[i][j] = teclado.next().charAt(0);
			}
		}
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) 
			{
				tabla2 [i][j] = (tabla1[i][j]-96);
			}
		}
		System.out.println("Matriz introducida:");
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) 
			{
				System.out.print("\t"+tabla1[i][j]);
			}
			System.out.println();
		}
		System.out.println("Las posiciones son:");
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) 
			{
				System.out.print("\t"+tabla2[i][j]);
			}
			System.out.println();
		}
		teclado.close();
	}

}

package Tablas;

import java.util.Scanner;

public class Traspuesta {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int tabla [][] = new int [3][3];
		int traspuesta[][]= new int[3][3];
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) 
			{
				System.out.println("Valor de "+i+"-"+j);
				tabla[i][j] = teclado.nextInt();
			}
		}
		
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) 
			{
				traspuesta[i][j]=tabla[j][i];
			}
		}
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) 
			{
				System.out.print(""+traspuesta[i][j]);
			}
			System.out.println("");
		}
		
		teclado.close();

	}

}

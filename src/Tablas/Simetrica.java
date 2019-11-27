package Tablas;

import java.util.Scanner;

public class Simetrica {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		boolean simetrica=true;
		int tabla [][] = new int [3][3];
		
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) 
			{
				System.out.println("Valor de "+i+"-"+j);
				tabla[i][j] = teclado.nextInt();
			}
		}
		
		for(int i=0; (i<3)&&(simetrica); i++) 
		{
			for(int j=0; (j<3)&&(simetrica); j++) 
			{
				if(tabla[i][j]!=tabla[j][i])
				{
					simetrica=false;
				}
			}
		}
		if(simetrica) 
		{
			System.out.println("Es sim�trica");	
		}
		else 
		{
			System.out.println("NO es sim�trica");
		}
		
		teclado.close();

	}

}
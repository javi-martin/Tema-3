package Tablas;

import java.util.Scanner;

public class Antisimetrica {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		boolean antisimetrica=true;
		int tabla [][] = new int [3][3];
		
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) 
			{
				System.out.println("Valor de "+i+"-"+j);
				tabla[i][j] = teclado.nextInt();
			}
		}
		
		for(int i=0; (i<3)&&(antisimetrica); i++) 
		{
			for(int j=0; (j<3)&&(antisimetrica); j++) 
			{
				if(tabla[i][j]!=-tabla[j][i])
				{
					antisimetrica=false;
				}
			}
		}
		if(antisimetrica) 
		{
			System.out.println("Es Antisimétrica");	
		}
		else 
		{
			System.out.println("NO es Antisimétrica");
		}
		
		teclado.close();

	}

}

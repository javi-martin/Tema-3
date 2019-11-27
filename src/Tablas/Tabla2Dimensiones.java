package Tablas;

import java.util.Scanner;

public class Tabla2Dimensiones {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		char tabla[][]= new char[3][4];
		
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<4; j++) 
			{
				System.out.println("Indique un carácter:("+i+","+j+")");
				tabla[i][j] = teclado.nextLine().charAt(0);
			}
		}
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<4; j++) 
			{
				System.out.print(""+tabla[i][j]);
			}
			System.out.println("");
		}
		
		teclado.close();

	}

}

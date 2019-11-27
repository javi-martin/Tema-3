package Tablas;

import java.util.Scanner;

public class ProductoMatrizNumero {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int tabla [][] = new int [3][3];
		int producto [][] = new int [3][3];
		int numero;
		
		System.out.println("Introducir tabla");
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) 
			{
				System.out.println("Valor de "+i+"-"+j);
				tabla[i][j] = teclado.nextInt();
			}
		}
		
		System.out.println("Introducir número");
		numero = teclado.nextInt();
		
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) 
			{
				producto[i][j] = tabla[i][j]*numero;			
			}
		}
		System.out.println("El producto de los valores de tabla por el número es:");
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) 
			{
				System.out.print(""+producto[i][j]);
			}
			System.out.println("");
		}
		
		teclado.close();

	}

}

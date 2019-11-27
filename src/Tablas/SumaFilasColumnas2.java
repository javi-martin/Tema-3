package Tablas;

import java.util.Scanner;

public class SumaFilasColumnas2 {
	

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		int tabla [][] = new int [3][3];
		int sumaFila0=0;
		int sumaFila1=0;
		int sumaFila2=0;
		int sumaColumna0=0;
		int sumaColumna1=0;
		int sumaColumna2=0;
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++) 
			{
				System.out.println("Valor de "+i+"-"+j);
				tabla[i][j] = teclado.nextInt();
			}
		}
		for(int j=0; j<3; j++)
		{
			sumaFila0=sumaFila0 + tabla[0][j];
		}
		for(int j=0; j<3; j++)
		{
			sumaFila1=sumaFila1 + tabla[1][j];
		}
		for(int j=0; j<3; j++)
		{
			sumaFila2=sumaFila2 + tabla[2][j];
		}
		for(int i=0; i<3; i++) 
		{
			sumaColumna0=sumaColumna0+tabla[i][0];
		}
		for(int i=0; i<3; i++) 
		{
			sumaColumna1=sumaColumna1+tabla[i][1];
		}
		for(int i=0; i<3; i++) 
		{
			sumaColumna2=sumaColumna2+tabla[i][2];
		}
		
		System.out.println("Suma primera fila: "+sumaFila0);
		System.out.println("Suma Segunda fila: "+sumaFila1);
		System.out.println("Suma Tercera fila: "+sumaFila2);
		System.out.println("Suma primera columna: "+sumaColumna0);
		System.out.println("Suma primera columna: "+sumaColumna1);
		System.out.println("Suma primera columna: "+sumaColumna2);
		
		teclado.close();		
			
	}

}

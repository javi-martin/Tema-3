package Tablas;

import java.util.Scanner;

public class Tablas1 {

	public static void main(String[] args) 
	{
		int tabla[] = new int[5];
		int i;
		
		Scanner teclado = new Scanner(System.in);
		// Recorrido para rellenar la tabla
		for(i=0;i<5;i++)
		{
			System.out.println("Ingrese el valor de la posición "+i+":");
			tabla[i] = teclado.nextInt();
		}
		// Recorrido para mostrar los valores de la tabla
		for(i=0;i<5;i++)
		{
			System.out.println("Tabla["+i+"]="+tabla[i]);
		}
		teclado.close();

	}

}

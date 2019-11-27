package Tablas;

import java.util.Scanner;
import java.util.Vector;

public class Suma2 {

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		Vector<Integer> tabla = new Vector<Integer>(10,1);
		int numero;		
		do 
		{
			System.out.println("Introduce un número entero (0 para salir)");
			numero = teclado.nextInt();
			if(numero!=0) 
			{
				tabla.addElement(numero);
			}
		}while(numero!=0);
		
		System.out.println("Suma de valores: "+sumar(tabla));
		teclado.close();

	}
	
	public static int sumar(Vector<Integer> v) 
	{
		int sumar=0;
		for(int i=0; i<v.size();i++) 
		{
			sumar=sumar+v.elementAt(i);
		}
		
		return(sumar);
	}

}

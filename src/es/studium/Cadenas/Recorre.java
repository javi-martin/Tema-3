package es.studium.Cadenas;

public class Recorre {

	public static void main(String[] args) 
	{
		String cadena = "ABCDEFGHIJKLM�OPQRSTUVWXYZ";
		
		for(int i=0; i<cadena.length(); i++) 
		{
			System.out.println(cadena.charAt(i));
		}

	}

}

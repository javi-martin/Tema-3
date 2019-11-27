package Tablas;

public class SumaPosicion {

	public static void main(String[] args) 
	{
		int tabla[][] = new int [10][10];
		
		for(int i=0; i<10; i++) 
		{
			for(int j=0; j<10; j++) 
			{
				tabla[i][j]=i+j;
			}
		}
		for(int i=0; i<10; i++) 
		{
			for(int j=0; j<10; j++) 
			{
				System.out.print("\t"+tabla[i][j]);
			}
			System.out.println("");
		}
		
	}

}

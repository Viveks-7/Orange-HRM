package Logical_Program;

public class fibonacci 
{
	public static void main(String[] args) 
	{
		// WAP to 1-10 fibonacci numbers
		int a[]=new int[10];
		a[0]=0;
		a[1]=1;
		
		for (int i = 2; i < a.length; i++) 
		{
			a[i]=a[i-1]+a[i-2];
		}
		
		// to print fibonacci series 
		for (int j = 0; j < a.length; j++) 
		{
			System.out.print(a[j]+" ");		
		}
	}

}

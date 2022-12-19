package Logical_Program;

public class fibonacci_practice 
{
	public static void main(String[] args) 
	{
		// WAP to print fibonacci first 20 digits
		
		long [] a = new long [50];
		a[0]=0;
		a[1]=1;;
		
		for (int i = 2; i < a.length; i++) 
		{
			a[i] = a[i-1] + a[i-2];			
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]+ " ");			
		}
		
		System.out.println();
		System.out.println(a.length);
	}

}

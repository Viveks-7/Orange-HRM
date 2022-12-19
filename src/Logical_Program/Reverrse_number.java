package Logical_Program;

import java.util.Scanner;

public class Reverrse_number 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a=s.nextInt();
		int rem;
		int rev=0;
		
		while(a>0)
		{
			rem=a%10;
			rev=rem+rev*10;
			a=a/10;			
		}
		
		System.out.println("The revese number is: "+rev);
				
		
	}

}

package Logical_Program;

import java.util.Scanner;

// palindrome 153= 1*1*1+5*5*5+3*3*3=153

public class Armstron_Number 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a=s.nextInt();
		int orig =a;
		int rem=0;
		int r;
		while(a>0)
		{
			r=a%10;
			rem=rem+r*r*r;
			a=a/10;
		}
		
		if(rem==orig)
		{
			System.out.println(orig+" is Palindrome number");
		}
		else
		{
			System.out.println(orig+" not a palindrome number");
		}
	}

}

package Logical_Program;

import java.util.Arrays;

public class Anagram 
{
	public static void main(String[] args) 
	{
		String a="abc";
		String a1="cba";
		char b[]=a.toCharArray();
		char b1[]=a1.toCharArray();
		Arrays.sort(b1);
		Arrays.sort(b);
		
		boolean result=Arrays.equals(b, b1);
		System.out.println(result);
//		if(result==true)
//		{
//			System.out.println("String are Anagram");
//		}
//		else
//		{
//			System.out.println("Strings are not anagram string");
//		}
				
		
	}

}

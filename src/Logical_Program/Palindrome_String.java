package Logical_Program;

public class Palindrome_String 
{
	public static void main(String[] args) 
	{
		String a= "vive";
		String b="";
		
		for (int i = a.length()-1; i >=0 ; i--)
		{
			b=b+a.charAt(i);		
		}
	
		System.out.print(a);
		
		if(a.equals(b))
		{
			System.out.println(" Is a Palindrome String");			
		}
		else
		{
			System.out.println(" Is Not a palindrome string");
		}
	}	
}

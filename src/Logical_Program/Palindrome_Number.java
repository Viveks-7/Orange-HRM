package Logical_Program;

// palindrome number 121 323 454 646 froward and reverse is same

public class Palindrome_Number 
{
	public static void main(String[] args) 
	{
		int a=12544521;
		int o=a;
		int rem;
		int rev=0;
		
		while(a>0)
		{
			rem=a%10;
			rev=rem+rev*10;
			a=a/10;
		}
		//System.out.println(rev);
		
		if(o==rev)
		{
			System.out.println(o+" is a Palindrome number");
		}
		else
		{
			System.out.println(o+" is not a Palindrome number");
		}
	}

}

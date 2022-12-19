package Logical_Program;

// reverse the number 1234 to 4321

public class first_logic 
{
	public static void main(String[] args) 
	{
		int a=1234; 
		int b=a;
		int rem;
		int rev=0;
		while(a>0)
		{
			rem=a%10;     
			rev=rem+rev*10;
			a=a/10;
		}
		System.out.println(b+" Reverse number is: "+rev);
	}

}

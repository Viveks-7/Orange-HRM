package Logical_Program;

public class Space_count
{
	public static void main(String[] args) 
	{
		String s= "I am not a expert programmer";
		int count=0;
		char s1=' ';
	
		for (int i = 0; i < s.length(); i++) 
		{
			char y=s.charAt(i);
			if(y==s1)
			{
				count++;
			}				
			
		}
		System.out.println(count);
	}

}

package Logical_Program;

public class Char_repeat_count {

	public static void main(String[] args)
	{
		String a="My name is vivek shinde"; 
		char b='e';
		int count=0;
		
		for (int i = 0; i < a.length(); i++) 
		{
			char y=a.charAt(i);
			if(b==y)
			{
				count++;				
			}
		
		}
		System.out.println(count);
		
	}

}

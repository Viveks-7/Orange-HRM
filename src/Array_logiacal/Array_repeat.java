package Array_logiacal;

public class Array_repeat 
{
	public static void main(String[] args) 
	{
		String s="vivekbhausahebshindevivek";
		//char b='i';
		// wrong program 
		
		for (int i = 0; i < s.length(); i++) 
		{
			
			int count = 1;
			char y=s.charAt(i);
			for (int j = i; j < s.length(); j++) 
			{
				char x=s.charAt(j);
				
				if(x==y && i!=j)
				{
					System.out.print(y);
					count++;
					
				
				}
				
			}
			if(count>1 && y!='0')
			{
				System.out.println("="+count);
			}			
			
		}
			
	}

}

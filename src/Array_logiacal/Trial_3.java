package Array_logiacal;

public class Trial_3 
{
	public static void main(String[] args) 
	{
		String a= "my name is vivek shinde and i am from ahmednagar";
		char []s=a.toCharArray();
		
		for (int i = 0; i < s.length; i++) 
		{
			int count = 1;
			
			for (int j = i; j < s.length; j++) 
			{
				if (s[i]==s[j] && i!=j)
				{
					count++;
					s[j]='0';
				}
				
			}
			
			if (count>1 && s[i]!='0')
			{
				System.out.println(s[i]+" = "+count);
			}
			
		}
		
		
		
		
	}

}

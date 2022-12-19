package Array_logiacal;

public class Trial_2 
{
	public static void main(String[] args) 
	{
		String s="My name is vivek bhausaheb shinde";
		
		char [] a=s.toCharArray();
		
		for (int i = 0; i < a.length; i++) 
		{
			int count=1;
			
			for (int j = i; j < a.length; j++) 
			{
				if(a[i]==a[j]  && i!=j )
				{
					count++;
					a[j]='0';
					
				}
				
			}
			if(count>1 && a[i]!='0')
			{
				System.out.println(a[i]+ " = " +count);
			}
			
		}
		
	
		
		
	}

}

package Logical_Program;

public class Count_AllCharRpeat
{
	public static void main(String[] args) 
	{
		String s ="worlds greatest scientist was nikola tesla";
		
		char[] v = s.toCharArray();		
		
		for (int i = 0; i < v.length; i++) 
		{
			int count=1;
			
			for (int j = 0; j < v.length; j++) 
			{
				
				if(v[i]==v[j] && i!=j)
				{
					count++;
					v[j]=0;
				}
				
			}
				
			
				if(v[i]!=0 && count>1 && v[i]!=' ')
				{
					System.out.println(v[i]+" = "+count);
						
				}
								
		}	
		
	}

}

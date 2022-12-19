package Array_logiacal;

public class Trial_1 
{
	public static void main(String[] args) 
	{
		String s="vivek vvvvshinde fromiiii ahmednagar";
		char []b=s.toCharArray();
		
		for (int i = 0; i < b.length; i++) 
		{
			int count=1;
			for (int j = i+1; j < b.length; j++) 
			{
				if(b[i]==b[j] && b[i] !=' ')
				{
					count++;
					b[j]='0';
				}
				
			}
			if(count>1 && b[i]!='0')
			{
				System.out.print(b[i]);
				System.out.println("="+count);
			}
			
		}
		
	}

}

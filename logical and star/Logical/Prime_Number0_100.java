package Logical;



public class Prime_Number0_100 {
	

	public static void main(String[] args) {
		int Num=100;
		int j;
		
		for(int i=2;i<=Num;i++)
		{
			int count = 0;

			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;        
				}
			}
			if(count==2)
				
			System.out.print(i+" , ");     
		}
	
	} 
}



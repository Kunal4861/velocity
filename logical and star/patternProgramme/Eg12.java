package patternProgramme;

public class Eg12 {

	public static void main(String[] args) {
//	    *      *
//		**    **
//		***  ***
//		********
//		***  ***
//		**    **
//		*      *

		//row-->7, col-->8
		
		
		int Star1 = 1; //left side
		int Space1 = 3;//left side
		int Star2 = 1; //right side
		int Space2 = 3;//right side
		
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=Star1;j++) {
				System.out.print("*");
			}
			for(int k=1;k<=Space1;k++)
			{
				System.out.print(" ");
			}
			
				for(int j=1;j<=Space2;j++) 
				{
					System.out.print(" ");
				}
				for(int k=1;k<=Star2;k++)
				{
					System.out.print("*");
				}	
				
				System.out.println();
				if(i<4) 
				{
					Star1++;
					Space1--;
					Star2++;
					Space2--;
				}
				else {
					Star1--;
					Space1++;
					Star2--;
					Space2++;
					
				}
		}

	}

}

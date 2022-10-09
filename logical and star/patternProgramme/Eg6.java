package patternProgramme;

public class Eg6 {

	public static void main(String[] args) {
		// *****
		//  ****
		//   ***
		//    **
		//     *
		//row-->5 col-->5
		//space=0, star=5
		int Space = 0;
		int Star = 5;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=Space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=Star;k++) 
			{
				System.out.print("*");
			}
			System.out.println();
			Space++;
			Star--;
			
		}
		
	}

}

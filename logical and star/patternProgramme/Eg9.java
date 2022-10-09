package patternProgramme;

public class Eg9 {

	public static void main(String[] args) {
//		*******
//		 *****
//		  ***
//		   *
		//Row--> 4  col-->7
		
		int Star = 7;
		int Space = 6;
		
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=Space;j++) {
				System.out.print(" ");//take space first
			}
			for(int k=1;k<=Star;k++) {
				System.out.print("*");
			}
			System.out.println();
			Star=Star-2;
			Space++;

		}
		
	}

}

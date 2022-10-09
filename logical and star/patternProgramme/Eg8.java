package patternProgramme;

public class Eg8 {

	public static void main(String[] args) {

//		    *
//		   **
//		  ***
//		 ****
//		*****

		// row-->5, col-->5
		int Star = 1;
		int Space = 4;

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= Space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= Star; k++) {
				System.out.print("*");
			}
			System.out.println();
			Star++;
			Space--;
		}

	}

}

package patternProgramme;

public class Eg10 {
	
//	*****
//	****
//	***
//	**
//	*
//	**
//	***
//	****
//	*****

	public static void main(String[] args) {
		//row-->9 col-->5
		int Star = 5;
		
		for(int i=1;i<=9;i++) 
		{
			for(int j=1;j<=Star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<5) {
				Star--;
			}
			else {
				Star++;
			}
		}

	}

}

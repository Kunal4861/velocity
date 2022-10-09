package Logical;

import java.util.LinkedHashSet;

public class REmoveDuplChar {

	public static void main(String[] args) {

		String Str = "avnish is good good boy";
		
		String[]arr=Str.split(" ");// in case of character directly use Str
		
		
		LinkedHashSet<String> LH = new LinkedHashSet<String>();
		for (int i = 0; i <arr.length; i++)
		{
            
			 LH.add(arr[i]);// in case of string use LH.add(ar[i])
			 
		}

		for (String a : LH) 
		{

			System.out.print(a+" ");
			
		}

	}

}

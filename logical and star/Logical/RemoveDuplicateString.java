package Logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateString {

	

	public static void main(String[] args) {
		String str="avnish is good good boy";

		String[]arr=str.split(" ");//{"avnish","is","good","good","boy"}
		
		ArrayList<String>AL=new ArrayList<String>(Arrays.asList(arr));
		
		System.out.println(AL);
		
		LinkedHashSet<String>LH=new LinkedHashSet<String>(AL);
		
		System.out.println(LH);
		
//System.out.println(String.join(" ", LH));
		for(String H:LH) {
			
			System.out.print(H+" ");
		}
		
		
		
		
	}

}

package Logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Filterduplicateelementsfromanarray {

	public static void main(String[] args) {
		
		
String[] str={"Mumbai","Delhi","Mumbai","Gurgaon","Mumbai"};

		ArrayList<String>AL=new ArrayList<String>(Arrays.asList(str));
		
		LinkedHashSet<String>LH=new LinkedHashSet<String>(AL);
		
		for(String k:LH) {
			System.out.print(k+" ");
			
			
		}
		
	}

}

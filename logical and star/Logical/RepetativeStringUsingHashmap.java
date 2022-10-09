package Logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class RepetativeStringUsingHashmap {

	public static void main(String[] args) {
		String Str = "java selenium java selenium automation";	
		String[] ar = Str.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0;i<=ar.length-1;i++)
		{
			String s1 = ar[i];
			if(map.containsKey(s1)) {
				map.put(s1, map.get(s1)+1);
			}
			else {
				map.put(s1, 1);
			}
		}
		
		Set<String> key = map.keySet();
		for(String k:key) 
		{    
			System.out.println(k+"="+map.get(k));
		}
		
LinkedHashSet<String>LH=new LinkedHashSet<String>(Arrays.asList(ar));
		
		System.out.println(LH);
		
//		System.out.println(String.join(",", LH));
		for(String H:LH) {
			
			System.out.print(H+" ");
		}
		 
		
	}

}

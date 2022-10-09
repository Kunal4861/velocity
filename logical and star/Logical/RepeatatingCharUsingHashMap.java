package Logical;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class RepeatatingCharUsingHashMap {

	public static void main(String[] args) {
		String str = "AbcaBcabCdef";
		
		
		String str1 = str.toLowerCase();//if string contain upper case then convert it to lower case
		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
	
		for (int i = 0; i <= str1.length() - 1; i++) 
		{
			char Charvalue = str1.charAt(i);
			
			if (mp.containsKey(Charvalue)) {
				mp.put(Charvalue, mp.get(Charvalue) + 1);

			} else {
				mp.put(Charvalue, 1);
			}

		}
		System.out.println(mp);
	
			
		
		Set<Character> keys = mp.keySet();
		
		for (Character k : keys) {
			System.out.println("count of "+k + "=" + mp.get(k));
			
		
			
			
		}
		
		LinkedHashSet<Character>LH= new LinkedHashSet<Character>(); 
		for(int i=0;i<str1.length();i++) {
			
	      LH.add(str1.charAt(i));
	}
		
		
		for(Character a:LH) {
			System.out.print(a);
		}

	}
	
		
		
		
		

		
		
		 
		
		
		
		
		
	}

	
	


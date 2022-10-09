package Logical;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
	
public class masterPiece {

	public static void main(String[] args) {
		
		String Str = "Mumbai Delhi Mumbai Gurgaon Mumbai ";	
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
		
		 ArrayList<String>AL=new ArrayList<String>(Arrays.asList(ar));
		 
		LinkedHashSet<String>LH=new LinkedHashSet<String>(AL);
		
		System.out.println("original String= "+Str);
		System.out.print("after removing duplicates from string,string becomes= ");
			
		for(String H:LH)
		{
				
				System.out.print(H+" ");
				
			}
			
	}

}

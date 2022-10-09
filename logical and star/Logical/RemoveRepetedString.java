package Logical;

import java.util.LinkedHashSet;

public class RemoveRepetedString {

	public static void main(String[] args) {
		String K="programme";
		
		LinkedHashSet< Character >LH=new LinkedHashSet<>();
		
		for(int i=0;i<=K.length()-1;i++) {
			
			LH.add(K.charAt(i));
			
			
		}
for(Character DuplCate:LH )
{
	System.out.print(DuplCate);
}

	}

}

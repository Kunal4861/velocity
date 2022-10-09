package Logical;

public class Reverse_Middle_String {

	public static void main(String[] args) {
		
		String Sample = "abc pqr xyz";
		String[]ar=Sample.split(" ");
		
		for(int i= 0;i<=ar.length-1;i++)
		{
			if(i%2==0) {
				System.out.print(ar[i]+" ");
			}
			else {
				String s=ar[i];
				ar[i]=RevString(s);
				System.out.print(ar[i]+" ");
			}
		}
		
		

	}
	
	public static String RevString(String input) 
	{
	String rev="";
	for(int i=input.length()-1;i>=0;i--) {
		
		rev=rev+input.charAt(i);
	}
	return rev;
	

}
}

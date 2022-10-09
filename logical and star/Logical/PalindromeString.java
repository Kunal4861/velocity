package Logical;

import java.util.Scanner;

public class PalindromeString {
	
	public static void main (String[] args) { 
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter String");
		String orignal = sc.next();
		System.out.println("given string is "+orignal);
		String rev="";
		
		for(int i=orignal.length()-1;i>=0;i--)
		{
			rev=rev+orignal.charAt(i);
			
		}
		System.out.println("reverse String is "+rev);
		
		if(orignal.equals(rev))
		{
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}
		
		
	}

}

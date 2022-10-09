package Logical;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter String value");
		String name=sc.next();//to provide input string
		String Rev="";
		System.out.println("given String is "+name);
		
		for(int i=name.length()-1;i>=0;i--) 
		{
			Rev=Rev+name.charAt(i);
		}
		System.out.println("reverse String is "+Rev);
		
		
		
		
		
	}

}

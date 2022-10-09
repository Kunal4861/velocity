package Logical;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter value");
		int num=sc.nextInt();
		String orignal = Integer.toString(num);//Converting int to string
		String rev = "";
		
		for(int i=orignal.length()-1;i>=0;i--)
		{
			rev=rev+orignal.charAt(i);
		}
		System.out.println("reverse number is "+rev);
		System.out.println("original number is "+num);
		
		int num1 = Integer.parseInt(rev);//Converting String to int
		System.out.println("reverse number is "+num1);

	}

}

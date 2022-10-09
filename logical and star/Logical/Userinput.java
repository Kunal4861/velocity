package Logical;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		
		//addition of a and b
		
		Scanner sc =new Scanner(System.in);// create Scanner class object to provide input
		System.out.println("enter vslue of a");
		int a=sc.nextInt();
		System.out.println("enter value of b");
		int b= sc.nextInt();
		
		int Sum = a+b;
		System.out.println("addition is "+ Sum);
		
		
	}

}

package Logical;

import java.util.Scanner;

public class ReverseInt_Without_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter number");
		int a = sc.nextInt();

		int rev = 0;
		for (int i = a; i > 0; i = i / 10) {

			int rem = i % 10;
			rev = rev * 10 + rem;

		}
		System.out.println(rev);
		System.out.println("orignal number is " + a);
		System.out.println("reverse number is " + rev);
		System.out.println("reverse of "+ a +" is "+rev);
	}
}

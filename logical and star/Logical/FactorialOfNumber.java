package Logical;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in) ;
			System.out.println("enter value of a");
			int a= sc.nextInt();
			int fact= 1;//use 1,because value to make number as it is in multiplication
			
			for(int i=a;i>0;i--)
			{
				fact=fact*i;
			}
			System.out.println("Factorial of " +a+ " is "+fact);
		}

	}



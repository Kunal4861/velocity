	package Logical;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter value of a");
         int a = sc.nextInt();
         int num = 0;
         
         for(int i=a;i>0;i=i/10) {
        	 
        	 int num1 = i%10;
        	 num=num+(num1*num1*num1);
         }
         System.out.println("addition of digit cube is "+num);
         
         if(a==num) {
        	 System.out.println("given number is a Armstrong number");
         }
         else {
        	 System.out.println("given number is not a Armstrong number");
         }
	}

}

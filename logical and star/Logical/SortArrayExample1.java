package Logical;

import java.util.Arrays;

public class SortArrayExample1 {
	public static void main(String[] args) {
//defining an array of integer type   
		int[] array =  { 90, 23, 5, 109, 12, 22, 67, 34 };
		
//invoking sort() method of the Arrays class  
		Arrays.sort(array);
		System.out.println("Elements of array sorted in ascending order: ");
//prints array using the for loop  
		for (int i = 0; i<= array.length-1; i++) {
			System.out.println(array[i]);
		}
		
		int size = array.length;
		int max = array[size-3];
	      System.out.println("3rd largest element is :"+max);
	}
}
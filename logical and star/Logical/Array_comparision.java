package Logical;

import java.util.Arrays;

public class Array_comparision {

	public static void main(String[] args) {
		int ar1[]= {10,20,30};
		int ar2[]= {10,20,40};
		int ar3[]= {10,20,30};
		//compare array1 and array2
		System.out.println("ar1 and ar2 are "+Arrays.equals(ar1, ar2));
		//compare array1 and array3
		System.out.println("ar1 and ar3 are "+Arrays.equals(ar1, ar3));
		

	}

}

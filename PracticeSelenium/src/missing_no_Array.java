
public class missing_no_Array {

	public static void main(String[] args) {
		int a[]= {1,2,3,5};
		
		int sum1 =0;

		for(int i=0;i<=a.length-1;i++) {
			sum1=sum1+a[i];
			
		}
		System.out.println(sum1);
		
		int sum2=0;
		for(int i=0;i<=5;i++) {
			sum2=sum2 +i;
		}
		System.out.println(sum2);
		
		System.out.println("missing number is = "+(sum2-sum1));
	}

}

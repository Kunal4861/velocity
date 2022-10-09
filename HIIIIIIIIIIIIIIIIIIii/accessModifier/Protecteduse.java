package accessModifier;

public class Protecteduse {
int a=12;
public int b = 22;
private int c=32;
protected int d= 42;


	public static void main(String[] args) {
		//we can call all members of class
		
	}

	public void dispaly1() {
		System.out.println("Hi I am public method from Protecteduse");}
		
		 void dispaly2() {
			System.out.println("Hi I am default method from Protecteduse");}
			
			
			private void dispaly3() {
				System.out.println("Hi I am private method from Protected use");}
				
				
				protected void dispaly4() {
					System.out.println("Hi I am protected method from Protecteduse");
					
	}
}

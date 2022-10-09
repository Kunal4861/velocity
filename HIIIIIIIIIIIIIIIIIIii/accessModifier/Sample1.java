package accessModifier;

public class Sample1 {

	public static void main(String[] args) {
		Protecteduse p= new Protecteduse();//created object of another class
		p.dispaly1(); //calling public method from another class which is visible within project 
		p.dispaly2(); // calling default method from another class which is visible within package
		//p.display3(;) cant call this method as it is not visible in another class
	
         p.dispaly4();//calling protected method from another class which is visible within project
		System.out.println(p.a);// calling default variable from another class
		System.out.println(p.b); // calling public variable from another class
		//System.out.println(p.c); // cant call private private variable from another class
		System.out.println(p.d); // calling protected variable from another class
	}

}
